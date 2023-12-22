import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bd = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            gcd(a, b);
            System.out.println(gcd(a, b));
        }
        else if (a == b) {
            System.out.println(a);
        }
        else {
            System.out.println(gcd(b, a));
        }



    }

    public static int gcd(int a, int b) {
        int r = a % b;
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(r);
        //System.out.println();
        if (r != 0) {
            return gcd(b, r);
        }
        else {
            return b;
        }
    }
/*
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        for (int i=0; i<6; i++) {
            d1.dice[i] = sc.nextInt();
        }
        for (int i=0; i<6; i++) {
            d2.dice[i] = sc.nextInt();
        }






        int[] d1 = new int[6];
        int[] d2 = new int[6];

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        for (int i=0; i<6; i++) d1[i] = sc.nextInt();
        for (int i=0; i<6; i++) d2[i] = sc.nextInt();



        for (int i=0; i<6; i++) {
            if (d1[0] == d2[i]) a = i;
            else if (d1[1] == d2[i]) b = i;
            else if (d1[2] == d2[i]) c = i;
            else if (d1[3] == d2[i]) d = i;
            else if (d1[4] == d2[i]) e = i;
            else if (d1[5] == d2[i]) f = i;
        }

        if (a + f == 5) {
            if (Dice.Roll(a+1, b+1) == c+1 && Dice.Roll(a+1, c+1) == e+1) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
    }
}

class Dice {
    int[] dice = new int[6];

    public static int Roll(int a, int b) {
        switch (a) {
            case 1: {
                switch (b) {
                    case 2: return 3;
                    case 3: return 5;
                    case 4: return 2;
                    case 5: return 4;
                }
            }
            case 2: {
                switch (b) {
                    case 1: return 4;
                    case 3: return 1;
                    case 4: return 6;
                    case 6: return 3;
                }
            }
            case 3: {
                switch (b) {
                    case 1: return 2;
                    case 2: return 6;
                    case 5: return 1;
                    case 6: return 5;
                }
            }
            case 4: {
                switch (b) {
                    case 1: return 5;
                    case 2: return 1;
                    case 5: return 6;
                    case 6: return 2;
                }
            }
            case 5: {
                switch (b) {
                    case 1: return 3;
                    case 3: return 6;
                    case 4: return 1;
                    case 6: return 4;
                }
            }
            case 6: {
                switch (b) {
                    case 2: return 4;
                    case 3: return 2;
                    case 4: return 5;
                    case 5: return 3;
                }
            }
        }
        return 0;


    }

 */
}
