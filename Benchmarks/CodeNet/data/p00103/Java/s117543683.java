
package kmcprocon1;

import java.util.Scanner;

public class KmcProcon1 {

    public static void main(String[] args) {
        int out = 0;
        int score;
        int[] base = {0, 0, 0};
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int i = 0;
        String[] arr = input.split("\n");
        int dataset = Integer.parseInt(arr[0]);
        i++;
        for (int j = 0; j < dataset;  j++) {
            boolean game = true;
            score =0;
            while (game) {
                switch (arr[i]) {
                    case "HIT":
                        if (base[2] == 1) {
                            score++;
                            base[2] = 0;
                        }
                        if (base[1] == 1) {
                            base[2] = 1;
                            base[1] = 0;
                        }
                        if (base[0] == 1) {
                            base[1] = 1;
                            base[0] = 0;
                        }
                        base[0] = 1;
                        break;
                    case "HOMERUN":
                        int runner = 1;
                        if (base[2] == 1) {
                            runner++;
                            base[2] = 0;
                        }
                        if (base[1] == 1) {
                            runner++;
                            base[1] = 0;
                        }
                        if (base[0] == 1) {
                            runner++;
                            base[0] = 0;
                        }
                        score += runner;
                        break;
                    case "OUT":
                        out++;
                        if (out > 2) {
                            game = false;
                        }
                        break;
                }
                i++;
            }
            System.out.println(score);
        }

    }

}