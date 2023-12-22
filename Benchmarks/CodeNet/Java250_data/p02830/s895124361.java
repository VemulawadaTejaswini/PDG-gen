import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String S = input.next();
        String T = input.next();

        String result = "";

        for (int i = 0; i < N; i++){
            result += S.substring(i, i+1) + T.substring(i, i+1);
        }

        System.out.println(result);
    }
}
