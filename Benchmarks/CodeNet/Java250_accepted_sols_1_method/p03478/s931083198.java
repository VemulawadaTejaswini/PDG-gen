import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        int result = 0;
        for (int i = 1; i <= N; i++) {
            String str = String.valueOf(i);
            //System.out.println("str：" + str);
            int sum = 0;

            //各桁に分ける
            for (int j = 0; j < str.length(); j++) {
                String s = str.substring(j, j+1);
                //System.out.println("s：" + s);
                int x = Integer.parseInt(s);
                //各桁の和
                sum += x;
            }

            //各桁の和が条件に合うか判定し合うものは足す
            if (A <= sum && sum <= B) {
                //System.out.println("sum：" + sum);
                result += i;
            }

        }
        System.out.println(result);
    }

}