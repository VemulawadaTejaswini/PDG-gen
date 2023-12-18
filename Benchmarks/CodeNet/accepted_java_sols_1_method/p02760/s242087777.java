

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] bingo = new int[3][3];
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                int cardNumber = scanner.nextInt();
                bingo[i][j] = cardNumber;

            }
        }

        int n = scanner.nextInt();
        int counter = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int m = 0; m < n; m++){
            int inputNumber = scanner.nextInt();
            list.add(inputNumber);
        }


        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo.length; j++) {
                if (list.contains(bingo[i][j])){
                    int index = list.indexOf(bingo[i][j]);
                    list.remove(index);
                    bingo[i][j] = 0;

                }

            }
        }


        //boolean tate1 = bingo[0][0] == 0 & bingo[1][0] == 0 & bingo[2][0] == 0;
        //boolean tate2 = bingo[0][1] == 0 & bingo[1][1] == 0 & bingo[2][1] == 0;
        //boolean tate3 = bingo[0][2] == 0 & bingo[1][2] == 0 & bingo[2][2] == 0;

        //boolean yoko1 = bingo[0][0] == 0 & bingo[0][1] == 0 & bingo[0][2] == 0;
        //boolean yoko2 = bingo[1][0] == 0 & bingo[1][1] == 0 & bingo[1][2] == 0;
        //boolean yoko3 = bingo[2][0] == 0 & bingo[2][1] == 0 & bingo[2][2] == 0;

        //boolean naname1 = bingo[0][0] == 0 & bingo[1][1] == 0 & bingo[2][2] == 0;
        //boolean naname2 = bingo[0][2] == 0 & bingo[1][1] == 0 & bingo[2][0] == 0;

        if (bingo[0][0] == 0 && bingo[1][0] == 0 && bingo[2][0] == 0 || bingo[0][1] == 0 && bingo[1][1] == 0 && bingo[2][1] == 0 || bingo[0][2] == 0 && bingo[1][2] == 0 && bingo[2][2] == 0) {
            System.out.println("Yes");
        } else if (bingo[0][0] == 0 && bingo[0][1] == 0 && bingo[0][2] == 0 || bingo[1][0] == 0 && bingo[1][1] == 0 && bingo[1][2] == 0 || bingo[2][0] == 0 && bingo[2][1] == 0 && bingo[2][2] == 0) {
            System.out.println("Yes");
        } else if (bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 || bingo[0][2] == 0 && bingo[1][1] == 0 && bingo[2][0] == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

}

