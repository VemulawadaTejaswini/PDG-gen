import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        boolean ans = false;

        for (int i = 0; i < 100; i++) {
            if(A * i % B == C)ans = true;
        }

        if (ans) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}