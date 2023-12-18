import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            if (width == 0 && height == 0) {
                break;
            }

            int[][] walls = new int[2 * height + 1][2 * width + 1];

            for (int i = 0; i < 2 * height - 1; i++) {
                int start = i % 2 == 0 ? 2 : 1;
                for (int j = start; j < 2 * width; j += 2) {
                    walls[i + 1][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < walls.length; i++) {
                walls[i][0] = 1;
                walls[i][walls[0].length - 1] = 1;
            }
            for (int j = 0; j < walls[0].length; j++) {
                walls[0][j] = 1;
                walls[walls.length - 1][j] = 1;
            }

            // for (int[] wallLine : walls) {
            // for (int wall : wallLine) {
            // System.out.print(wall);
            // }
            // System.out.println();
            // }

            ArrayList<Answer> answers = new ArrayList<Answer>();
            ArrayList<Answer> answersToBeRemoved = new ArrayList<Answer>();
            ArrayList<Answer> answersToBeAdded = new ArrayList<Answer>();

            answers.add(new Answer(width, height));

            int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

            boolean notReachedGoal = true;
            int minRouteLength = 0;

            while (notReachedGoal) {
                for (Answer answer : answers) {
                    for (int[] direction : directions) {
                        int wallI = answer.i + direction[0];
                        int wallJ = answer.j + direction[1];
                        if (walls[wallI][wallJ] == 0) {
                            int nextI = answer.i + direction[0] * 2;
                            int nextJ = answer.j + direction[1] * 2;

                            if (answer.areas[nextI][nextJ] == 0) {
                                // System.out.println("at " + answer.i + ", " + answer.j);
                                // System.out.println("to " + direction[0] + ", " + direction[1]);
                                // answer.printAreas();
                                
                                Answer newAnswer = answer.createNewAnswerTo(direction[0], direction[1]);

                                if (nextI == walls.length - 2 && nextJ == walls[0].length - 2) {
                                    minRouteLength = newAnswer.routeLength;
                                    notReachedGoal = false;
                                } else {
                                    answersToBeAdded.add(newAnswer);
                                }
                            }
                        }
                    }
                    answersToBeRemoved.add(answer);
                }

                for (Answer answerToBeAdded : answersToBeAdded) {
                    answers.add(answerToBeAdded);
                }
                for (Answer answerToBeRemoved : answersToBeRemoved) {
                    answers.remove(answerToBeRemoved);
                }

                if (answers.size() == 0) {
                    minRouteLength = 0;
                    break;
                }
            }

            System.out.println(minRouteLength);
        }

        sc.close();
    }

}

class Answer {

    public int width, height;
    public int[][] areas; // the passed square = 1
    public int routeLength;
    public int i, j;

    public Answer(int width, int height) {
        this.width = width;
        this.height = height;
        this.areas = new int[2 * height + 1][2 * width + 1];

        for (int i = 0; i < this.areas.length; i++) {
            Arrays.fill(this.areas[i], 0);
        }

        this.routeLength = 1;
        this.i = 1;
        this.j = 1;
        this.areas[this.i][this.j] = 1;
    }

    public Answer(Answer prevAans) {
        this.width = prevAans.width;
        this.height = prevAans.height;
        this.areas = prevAans.areas.clone();
        this.routeLength = prevAans.routeLength;
        this.i = prevAans.i;
        this.j = prevAans.j;
    }

    public Answer createNewAnswerTo(int i, int j) {
        Answer newAnswer = new Answer(this);

        newAnswer.i += i * 2;
        newAnswer.j += j * 2;
        newAnswer.areas[newAnswer.i][newAnswer.j] = 1;
        newAnswer.routeLength++;

        return newAnswer;
    }

    public void printAreas(){
            for (int[] areaLine : this.areas) {
                for (int area : areaLine) {
                    System.out.print(area);
                }
                System.out.println();
            }
    }
}
