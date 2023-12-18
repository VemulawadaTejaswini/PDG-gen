import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();
        boolean judge = false; 
        
        for(int i=0; i<T; i++){
            A += V;
            B += W;
            if(A == B){
                judge = true;
                break;
            }
        }
        
        if(judge) System.out.println("YES");
        else System.out.println("NO");
    }
}
