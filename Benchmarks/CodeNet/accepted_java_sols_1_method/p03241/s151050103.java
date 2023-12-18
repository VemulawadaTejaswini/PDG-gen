import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int ans = 1;
        for(int A = 1; A * A <= M; A++){
            if(M % A != 0) continue;
            int B = M / A;

            if((long)A * N <= M) ans = Math.max(ans, A);
            if((long)B * N <= M) ans = Math.max(ans, B);
        }
        System.out.println(ans);
    }
}