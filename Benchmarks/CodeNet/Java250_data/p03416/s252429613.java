import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int c = 0;
        for (int i = a; i <= b; i++) {
            StringBuffer sb = new StringBuffer(String.valueOf(i));
            String revNum = sb.reverse().toString();
            int num = Integer.parseInt(revNum);

            if (i == num) {
                c++;
            }
        }

        System.out.println(c);
    }
}
