import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true) {
            int x = stdIn.nextInt();
            int y = stdIn.nextInt();

            if (x>y) {
                int n = x;
                x = y;
                y = n;
            } else if (y == 0 && x == 0) {
                break;
            }

            sb.append(x+" "+y).append("\n");
        }
        System.out.println(sb);
    }
}