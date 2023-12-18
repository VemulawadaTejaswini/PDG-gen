import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();

            if (m == -1 && f == -1 && r == -1)
                break;

            System.out.println(grade(m, f, r));
        }
    }
    private static char grade(int m, int f, int r) {
        if (m == -1 || f == -1) {
            return 'F';
        } else if (m + f >= 80) {
            return 'A';
        } else if (m + f >= 65){
            return 'B';
        } else if (m + f >= 50) {
            return 'C';
        } else if (m + f >= 30) {
            return (r >= 50) ? 'C' : 'D';
        }
        return 'F';
    }
}
