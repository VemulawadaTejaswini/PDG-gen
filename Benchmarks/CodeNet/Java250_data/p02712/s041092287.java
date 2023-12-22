import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();

        long ans = 0;

        for (int i = 1; i <= N; i++) {
            if(i % 5 == 0 && i % 3 == 0) continue;
            if(i % 5 == 0 || i % 3 == 0) continue;
            ans+= i;
        }

        out.println(ans);
        out.close();


    }
}
