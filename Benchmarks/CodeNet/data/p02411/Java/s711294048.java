import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int m = scan.nextInt();
            int f = scan.nextInt();
            int r = scan.nextInt();
            if (m == -1 && f == -1 && r == -1) {
                break;
            }
            if ((m + f) >= 80) {
                sb.append("A").append("\n");
            } else if ((m + f) >= 65 && (m + f) <= 79) {
                sb.append("B").append("\n");
            } else if (m + f >= 50 && (m + f) <= 64) {
                sb.append("C").append("\n");
            } else if((m + f) >= 30 && (m + f) <= 49) {
                sb.append("D").append("\n");
            } else if ((m + f) >= 30 && (m + f) <= 49 && r >= 49) {
                sb.append("C").append("\n");
            } else  {
                sb.append("F").append("\n");
            }
        }
        System.out.print(sb);
    }
}