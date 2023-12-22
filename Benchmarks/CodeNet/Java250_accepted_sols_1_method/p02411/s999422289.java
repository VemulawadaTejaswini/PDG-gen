import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            int m = s.nextInt();
            int f = s.nextInt();
            int r = s.nextInt();
            int sum = m + f;
            char ret = 'F';
            if(m == -1 && f == -1 && r == -1) {
                return;
            } else if(m == -1 || f == -1) {
                ret = 'F';
            } else if(sum >= 80) {
                ret = 'A';
            } else if(sum >= 65) {
                ret = 'B';
            } else if(sum >= 50 || (sum >= 30 && r >= 50)) {
                ret = 'C';
            } else if(sum >= 30) {
                ret = 'D';
            }
            System.out.println(ret);
        }
    }
}