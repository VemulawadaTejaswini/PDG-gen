import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n == 0) {
            System.out.println((m * m - m) / 2);
        }else if(m == 0){
            System.out.println((n * n - n) / 2);
        }else {
            int resultn = ((n * n - n) / 2);
            int resultm = ((m * m - m) / 2);
            System.out.println(resultm + resultn);
        }
    }
}