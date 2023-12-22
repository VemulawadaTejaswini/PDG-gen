import java.util.Scanner;

/**
 * @author shengboxu
 */

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 111;
        for (int i = N; i < 1000; i++) {
            String[] str = String.valueOf(i).split("");
            if (str[0].equals(str[1]) && str[1].equals(str[2])) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
