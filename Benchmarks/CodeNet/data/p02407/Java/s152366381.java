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
            } else if (x == 0 && y == 0) {
                break;
            }

            sb.append(x).append(" ").append(y).append("\n");
        }
        System.out.println(sb);
    }
}