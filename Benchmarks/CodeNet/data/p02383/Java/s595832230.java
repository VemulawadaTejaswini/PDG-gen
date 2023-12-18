package ITP1_11.A;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kazu0 = scanner.nextInt();
        int kazu1 = scanner.nextInt();
        int kazu2 = scanner.nextInt();
        int kazu3 = scanner.nextInt();
        int kazu4 = scanner.nextInt();
        int kazu5 = scanner.nextInt();

        String roll = scanner.next();

        String[] rolls = roll.split("");

        int[] diceNum = new int[6];
        diceNum[0] = kazu0;
        diceNum[1] = kazu1;
        diceNum[2] = kazu2;
        diceNum[3] = kazu3;
        diceNum[4] = kazu4;
        diceNum[5] = kazu5;

        int prenum = 0;

        if (rolls[0].equals("W")) {
            System.out.println(diceNum[3]);
            prenum = 3;
        }

        if (rolls[0].equals("E")) {
            System.out.println(diceNum[2]);
            prenum = 2;
        }

        if (rolls[0].equals("S")) {
            System.out.println(diceNum[5]);
            prenum = 5;
        }

        if (rolls[0].equals("N")) {
            System.out.println(diceNum[0]);
            prenum = 0;
        }

        for (int i = 1; i < roll.split("").length; i++) {
            if (prenum == 0) {
                if (rolls[0].equals("W")) {
                    System.out.println(diceNum[3]);
                    prenum = 3;
                }

                if (rolls[0].equals("E")) {
                    System.out.println(diceNum[2]);
                    prenum = 2;
                }

                if (rolls[0].equals("S")) {
                    System.out.println(diceNum[1]);
                    prenum = 1;
                }

                if (rolls[0].equals("N")) {
                    System.out.println(diceNum[5]);
                    prenum = 5;
                }
            }
            if (prenum == 1) {
                if (rolls[0].equals("W")) {
                    System.out.println(diceNum[3]);
                    prenum = 3;
                }

                if (rolls[0].equals("E")) {
                    System.out.println(diceNum[2]);
                    prenum = 2;
                }

                if (rolls[0].equals("S")) {
                    System.out.println(diceNum[1]);
                    prenum = 1;
                }

                if (rolls[0].equals("N")) {
                    System.out.println(diceNum[5]);
                    prenum = 5;
                }
            }

            if (prenum == 2) {
                if (rolls[0].equals("W")) {
                    System.out.println(diceNum[2]);
                    prenum = 2;
                }

                if (rolls[0].equals("E")) {
                    System.out.println(diceNum[4]);
                    prenum = 4;
                }

                if (rolls[0].equals("S")) {
                    System.out.println(diceNum[5]);
                    prenum = 5;
                }

                if (rolls[0].equals("N")) {
                    System.out.println(diceNum[0]);
                    prenum = 0;
                }
            }

            if (prenum == 3) {
                if (rolls[0].equals("W")) {
                    System.out.println(diceNum[4]);
                    prenum = 4;
                }

                if (rolls[0].equals("E")) {
                    System.out.println(diceNum[1]);
                    prenum = 1;
                }

                if (rolls[0].equals("S")) {
                    System.out.println(diceNum[5]);
                    prenum = 5;
                }

                if (rolls[0].equals("N")) {
                    System.out.println(diceNum[0]);
                    prenum = 0;
                }
            }

            if (prenum == 4) {
                if (rolls[0].equals("W")) {
                    System.out.println(diceNum[2]);
                    prenum = 2;
                }

                if (rolls[0].equals("E")) {
                    System.out.println(diceNum[3]);
                    prenum = 3;
                }

                if (rolls[0].equals("S")) {
                    System.out.println(diceNum[5]);
                    prenum = 5;
                }

                if (rolls[0].equals("N")) {
                    System.out.println(diceNum[0]);
                    prenum = 0;
                }
            }

            if (prenum == 5) {
                if (rolls[0].equals("W")) {
                    System.out.println(diceNum[3]);
                    prenum = 3;
                }

                if (rolls[0].equals("E")) {
                    System.out.println(diceNum[2]);
                    prenum = 2;
                }

                if (rolls[0].equals("S")) {
                    System.out.println(diceNum[0]);
                    prenum = 0;
                }

                if (rolls[0].equals("N")) {
                    System.out.println(diceNum[1]);
                    prenum = 1;
                }
            }
        }
    }
}