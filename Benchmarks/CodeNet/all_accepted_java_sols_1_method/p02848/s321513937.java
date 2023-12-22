import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String text = "";
        int max = s.length();
        for (int i=0; i<max; i++) {
            int c = s.charAt(i) + n;
            if (c > 'Z') c = 'A' + c - 'Z' - 1;
            System.out.print((char)c);
        }
        System.out.println("");
    }
}