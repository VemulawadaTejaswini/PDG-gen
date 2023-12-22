import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int max = Math.max(A, Math.max(B, C));
        int min = Math.min(A, Math.min(B, C));
        int mid;
        if( (A >= B && B >= C) ||
            (C >= B && B >= A))
            mid = B;
        else if( (C >= A && A >= B) ||
            (B >= A && A >= C))
            mid = A;
        else 
            mid = C;
        int count = 0;
        
        if((mid - min) % 2 == 0){
            count += (max-mid) + (mid-min)/2;
        } else {
            count += (max-mid) + (mid-1-min)/2 + 2;
        }

        System.out.println(count);
    }
}