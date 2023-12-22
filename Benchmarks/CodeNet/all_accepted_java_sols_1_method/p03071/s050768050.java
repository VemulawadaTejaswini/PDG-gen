import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;

        if(A>=B){
            ans += A;
            A -= 1;
        }
        else if(A<B){
            ans += B;
            B -= 1;
        }

        if(A>=B){
            ans += A;
            A -= 1;
        }
        else if(A<B){
            ans += B;
            B -= 1;
        }
        System.out.println(ans);        
    }
}