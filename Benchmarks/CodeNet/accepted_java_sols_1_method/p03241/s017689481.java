import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int a = M/N;
        int ans = 1;
        for(int i = a; i >= 1; i--){
            if(M%i == 0){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}