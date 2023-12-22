import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        
        if(A>=K){
            System.out.println(K);
        }else if(A<K && A+B>=K){
            System.out.println(A);
        }else if(A+B<K){
            System.out.println(A-(K-A-B));
        }

    }
}
