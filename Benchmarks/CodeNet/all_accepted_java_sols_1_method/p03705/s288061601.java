import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if(A>B || (N == 1 && A!=B))
            System.out.println(0);
        else if(N==2){
            if(A == B)
                System.out.println(1);
            else
                System.out.println(3);
        } else {
            System.out.println((long)(B-A)*(N-2)+1);
        }
    }
}