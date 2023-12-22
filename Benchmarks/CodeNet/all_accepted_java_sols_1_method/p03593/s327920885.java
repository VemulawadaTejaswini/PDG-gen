import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        String[] letters = new String[h];

        int[] occurrences = new int[26];
        int numOfFours = 0;
        int numOfTwos = 0;
        int numOfOnes = 0;

        for (int i = 0; i < letters.length; i++) {
            letters[i] = scanner.next();
            for (int j = 0; j < letters[i].length(); j++) {
                occurrences[letters[i].charAt(j) - 'a']++;
            }
        }
        boolean isPossible = true;

        if (h % 2 == 0 && w % 2 == 0){
            for (int occurrence : occurrences) {
                if (occurrence % 4 != 0) {
                    isPossible = false;
                    break;
                } else numOfFours += (occurrence / 4);
            }

            if (numOfFours != (h/2)*(w/2)) isPossible = false;
        }
        else if (h % 2 == 0 && w % 2 == 1){
            for (int i = 0; i < occurrences.length; i++) {
                if (occurrences[i] != 0 && occurrences[i] % 2 == 0){
                    while (numOfFours < (h/2)*(w/2) && occurrences[i] >= 4){
                        numOfFours ++;
                        occurrences[i] -= 4;
                    }
                }
            }

            for (int i = 0; i < occurrences.length; i++) {
                if (occurrences[i] % 2 != 0){
                    isPossible = false;
                    break;
                }
                if (occurrences[i] != 0 && occurrences[i] % 2 == 0){
                    while (numOfTwos < (h/2) && occurrences[i] > 0){
                        numOfTwos ++;
                        occurrences[i] -= 2;
                    }
                }
            }

            for (int occurrence : occurrences) {
                if (occurrence != 0) {
                    isPossible = false;
                    break;
                }
            }

            if (numOfFours != (h/2)*(w/2) || numOfTwos != (h/2)) isPossible = false;
        }
        else if (h % 2 == 1 && w % 2 == 0){
            for (int i = 0; i < occurrences.length; i++) {
                if (occurrences[i] != 0 && occurrences[i] % 2 == 0){
                    while (numOfFours < (h/2)*(w/2) && occurrences[i] >= 4){
                        numOfFours ++;
                        occurrences[i] -= 4;
                    }
                }
            }

            for (int i = 0; i < occurrences.length; i++) {
                if (occurrences[i] % 2 != 0){
                    isPossible = false;
                    break;
                }
                if (occurrences[i] != 0 && occurrences[i] % 2 == 0){
                    while (numOfTwos < (w/2) && occurrences[i] > 0){
                        numOfTwos ++;
                        occurrences[i] -= 2;
                    }
                }
            }

            for (int occurrence : occurrences) {
                if (occurrence != 0) {
                    isPossible = false;
                    break;
                }
            }

            if (numOfFours != (h/2)*(w/2) || numOfTwos != (w/2)) isPossible = false;
        }
        else {
            for (int i = 0; i < occurrences.length; i++) {
                if (occurrences[i] != 0){
                    while (numOfFours < (h/2)*(w/2) && occurrences[i] >= 4){
                        numOfFours ++;
                        occurrences[i] -= 4;
                    }
                }
            }

            for (int i = 0; i < occurrences.length; i++) {
                if (occurrences[i] != 0){
                    while (numOfTwos < ((h/2) + (w/2)) && occurrences[i] >= 2){
                        numOfTwos ++;
                        occurrences[i] -= 2;
                    }
                }
            }

            for (int i = 0; i < occurrences.length; i++) {
                if (occurrences[i] == 1) {
                    numOfOnes++;
                    occurrences[i] -= 1;
                }
            }

            for (int occurrence : occurrences) {
                if (occurrence != 0) {
                    isPossible = false;
                    break;
                }
            }

            if (numOfFours != (h/2)*(w/2) || numOfTwos != (h/2) + (w/2) || numOfOnes != 1) isPossible = false;
        }

        System.out.println(isPossible?"Yes":"No");
    }
}
