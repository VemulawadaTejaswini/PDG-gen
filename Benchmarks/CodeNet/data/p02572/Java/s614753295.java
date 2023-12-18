import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] A = new long[n];
        for(int i = 0; i<n; i++){
            A[i] = sc.nextLong();
        }

        List<Long> mulResult = new ArrayList<>();

        for(int i = 0; i<n-1; i++){
            for(int j = i + 1; j<n; j++){
                long mul = A[i] * A[j];
                mul = mul % (1000000000 + 7);
                mulResult.add(mul);
                //System.out.println(mul);
            }
        }


        long sum = 0;
        for(Long lon : mulResult){
            sum += lon;
        }
        System.out.println(sum  % (1000000000 + 7));

    }
}