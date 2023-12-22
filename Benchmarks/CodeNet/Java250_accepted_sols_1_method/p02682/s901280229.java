import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.math.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        if(A+B<=K){
            System.out.println(A+(-1)*(K-A-B));
        }
        else{
            if(A>=K) System.out.println(K);
            else System.out.println(A);
        }

    }

}