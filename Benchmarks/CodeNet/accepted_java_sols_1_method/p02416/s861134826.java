import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            if (s.length() < 2 && Integer.parseInt(s) == 0) {
                break;
            }

            int sum = 0;

            String[] strArr = s.split("");
            for (int i=0; i<strArr.length; ++i) {
                sum += Integer.parseInt(strArr[i]);
            }

            System.out.println(sum);
        }
    }
}
