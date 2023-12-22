import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nLen = String.valueOf(n).length();
        int result = 0;
        for (int i = 0; i < nLen / 2; i++) {
            result += 9 * (int)Math.pow(100, i);
        }
        if (nLen % 2 != 0) {
            int start = (int)Math.pow(10, nLen - 1);
            result += n - start + 1;
        }
        System.out.println(result);
        sc.close();
    }
}