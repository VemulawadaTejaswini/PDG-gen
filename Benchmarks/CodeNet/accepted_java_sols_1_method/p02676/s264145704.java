
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int K = sc.nextInt();
    static String S = sc.next();

    public static void main(String[] args) {
        char str[] = S.toCharArray();
        if (str.length <= K){
            System.out.println(S);
            return;
        }
        for (int i = 0; i < K; i++){
            System.out.print(str[i]);
        }
        System.out.print("...");
    }
}
