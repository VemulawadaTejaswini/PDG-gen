import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] aHand = sc.nextLine().toCharArray();
        char[] bHand = sc.nextLine().toCharArray();
        char[] cHand = sc.nextLine().toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;

        int next = aHand[a];
        a++;

        while (true) {
            switch (next) {
            case 'a':
                if (aHand.length <= a) {
                    System.out.println("A");
                    return;
                }
                break;
            case 'b':
                if (bHand.length <= b) {
                    System.out.println("B");
                    return;
                }
                break;
            case 'c':
                if (cHand.length <= c) {
                    System.out.println("C");
                    return;
                }
                break;
            }

            switch (next) {
            case 'a':
                next = aHand[a];
                a++;
                break;
            case 'b':
                next = bHand[b];
                b++;
                break;
            case 'c':
                next = cHand[c];
                c++;
                break;
            }
        }
    }
}