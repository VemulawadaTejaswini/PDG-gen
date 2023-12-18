import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
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
