import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.math.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double A[] = new double[N];
        double ans = 1;
        for(int i=0;i<N;i++){
            A[i] = scanner.nextDouble();
            ans *= A[i];
            if(ans > 100000000000000000.0){
                ans = -1;
            }
        }

        System.out.println((int)ans);


    }

}