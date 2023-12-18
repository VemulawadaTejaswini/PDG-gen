import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String S = sc.next();
            if(S.equals("-")) break;
            int m = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum += sc.nextInt();
            }
            int result = sum % S.length();
            System.out.println(S.substring(result)+S.substring(0, result));
        }
    }
}
