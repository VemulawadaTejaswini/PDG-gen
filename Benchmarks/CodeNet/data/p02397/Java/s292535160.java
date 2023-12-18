import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while(true) {
            int x = stdIn.nextInt();
            int y = stdIn.nextInt();

            if (x>y) {
                int n = x;
                x = y;
                y = n;
            }

            System.out.println(x+" "+y);
        }
    }
}