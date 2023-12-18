import java.util.*;
public class Main {
    public static void main(String[]args){
        // 標準入力
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();
        Long A = 0L; 
        for (long i = 1 ;i*i <=N; i++){
            if (N%i == 0 && i> A)
            A = i;

        }
        Long B = N/A;

        System.out.println(A+B-2);
    }   
       
}       