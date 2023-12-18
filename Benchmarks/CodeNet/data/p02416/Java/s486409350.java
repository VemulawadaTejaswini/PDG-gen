import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int p = line.length();
        int b=0;
        outer:
        while (true) {


            for (int i = 0; i < p; i++) {
                char a = line.charAt(i);
                if (p == 1 && a == 48) {
                    break outer;
                }
                b = b + (a - 48);
            }
            System.out.println(b);
        }
    }

}

