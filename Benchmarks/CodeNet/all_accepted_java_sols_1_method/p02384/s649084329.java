
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer[] set1 = {1, 2, 6, 5, 1};
        Integer[] set2 = {2, 3, 5, 4, 2};
        Integer[] set3 = {1, 3, 6, 4, 1};

        //Read stuff
        Scanner reader = new Scanner(System.in);

        //Given faces and result
        int face1, face2;
        List<String> face3 = new ArrayList<>();

        //Get die faces
        String[] die = reader.nextLine().split(" ");
        List<String> diee = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            diee.add(die[i]);
        }

        //Get questions
        List<String> questions = new ArrayList<>();
        int n = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < n; i++) {
            questions.add(reader.nextLine());
        }

        //Parse questions, search for 3rd face
        for (int i = 0; i < n; i++) {
            String[] faces = questions.get(i).split(" ");
            face1 = diee.indexOf(faces[0]) + 1;
            face2 = diee.indexOf(faces[1]) + 1;
            boolean isFound = false;


            //1,2,6,5,1
            for (int j = 0; j < 4; j++) {
                if (set1[j] == face1 && set1[j + 1] == face2) {
                    face3.add(diee.get(3-1));
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                continue;
            }

            for (int j = 4; j > 0; j--) {
                if (set1[j] == face1 && set1[j - 1] == face2) {
                    face3.add(diee.get(4-1));
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                continue;
            }

            //2,3,5,4,2
            for (int j = 0; j < 4; j++) {
                if (set2[j] == face1 && set2[j + 1] == face2) {
                    face3.add(diee.get(1-1));
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                continue;
            }

            for (int j = 4; j > 0; j--) {
                if (set2[j] == face1 && set2[j - 1] == face2) {
                    face3.add(diee.get(6-1));
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                continue;
            }

            //1,3,6,4,1
            for (int j = 0; j < 4; j++) {
                if (set3[j] == face1 && set3[j + 1] == face2) {
                    face3.add(diee.get(5-1));
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                continue;
            }

            for (int j = 4; j > 0; j--) {
                if (set3[j] == face1 && set3[j - 1] == face2) {
                    face3.add(diee.get(2-1));
                    break;
                }
            }
        }

        //Print result
        for (String x : face3) {
            System.out.println(x);
        }

    }

}