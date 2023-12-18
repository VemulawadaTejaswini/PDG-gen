import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Dice[] dice = new Dice[n];
        for (int i =0; i < n; i++) {
            dice[i] = new Dice(br.readLine().split(" "));
        }

        int i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (dice[i].equals(dice[j])) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}

class Dice {
    private int[] dice = new int[6];

    Dice (String[] num) {
        for (int i = 0; i < 6; i++) {
            dice[i] = Integer.parseInt(num[i]);
        }
    }

    public void roll (char direction) {
        int temp;
        switch (direction) {
            case 'N':
            temp = dice[0];
            dice[0] = dice[1];
            dice[1] = dice[5];
            dice[5] = dice[4];
            dice[4] = temp;
            break;

            case 'S':
            temp = dice[0];
            dice[0] = dice[4];
            dice[4] = dice[5];
            dice[5] = dice[1];
            dice[1] = temp;
            break;

            case 'E':
            temp = dice[0];
            dice[0] = dice[3];
            dice[3] = dice[5];
            dice[5] = dice[2];
            dice[2] = temp;
            break;

            case 'W':
            temp = dice[0];
            dice[0] = dice[2];
            dice[2] = dice[5];
            dice[5] = dice[3];
            dice[3] = temp;
            break;
        }
    }

    public int getFace (int num) {
        return dice[num];
    }

    public void setTopFace (int top) {
        if (top == dice[1]) {
            this.roll('N');
        } else if (top == dice[2]) {
            this.roll('W');
        } else if (top == dice[3]) {
            this.roll('E');
        } else if (top == dice[4]) {
            this.roll('S');
        } else if (top == dice[5]) {
            this.roll('N');
            this.roll('N');
        }
    }

    public void setFrontFace (int front) {
        int temp;
        if (front == dice[2]) {
            temp = dice[1];
            dice[1] = dice[2];
            dice[2] = dice[4];
            dice[4] = dice[3];
            dice[3] = temp;
        } else if (front == dice[3]) {
            temp = dice[1];
            dice[1] = dice[3];
            dice[3] = dice[4];
            dice[4] = dice[2];
            dice[2] = temp;
        } else if (front == dice[4]) {
            temp = dice[1];
            dice[1] = dice[4];
            dice[4] = temp;
            temp = dice[2];
            dice[2] = dice[3];
            dice[3] = temp;
        }
    }

    public boolean equals (Dice dice2) {
        int topFace = dice2.getFace(0);
        int frontFace = dice2.getFace(1);
        int i;
        outside: for (i = 0; i < 6; i++) {
            if (this.getFace(i) == topFace) {
                this.setTopFace(topFace);

                for (i = 1; i < 5; i++) {
                    if (this.getFace(i) == frontFace) {
                        this.setFrontFace(frontFace);

                        for (i = 2; i < 6; i++) {
                            if (this.getFace(i) != dice2.getFace(i)) {
                                break outside;
                            }
                        }

                        return true;
                    }
                }

                break;
            }
        }

        return false;
    }
}