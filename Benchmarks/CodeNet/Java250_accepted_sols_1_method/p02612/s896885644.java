
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

        Integer N = sc.nextInt();

        Integer ans = 0;
        if (N%1000 != 0) {// N が1000で割り切れないとき
            ans = (N/1000 + 1)*1000 - N;
        }

        System.out.println(ans);
    }
}