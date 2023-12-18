import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ar = str.split("");
        int c = 0;
        String r = "R";
        if (ar[0].equals(r)) {
            c = c + 1;
        } else {
            c = c;
        }
        if (ar[1].equals(r)) {
            c = c + 1;
        } else {
            c = c;
        }
        if (ar[2].equals(r)) {
            c = c + 1;
        } else {
            c = c;
        }
        if (c == 1 || c == 3 || c == 0) {
            System.out.println(c);
        } else if ( c == 2 && ar[0].equals(r) && ar[2].equals(r)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}