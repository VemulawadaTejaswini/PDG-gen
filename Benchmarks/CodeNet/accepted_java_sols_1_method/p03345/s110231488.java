import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long K = sc.nextLong();
        sc.close();

        if(K%2 == 0)
            System.out.println(A-B);
        else
            System.out.println(B-A);
    }
}