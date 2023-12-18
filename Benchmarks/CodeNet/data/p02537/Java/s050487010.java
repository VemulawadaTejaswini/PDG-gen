import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] a = new int[N];
        
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        
        int count = 1;
        
        int X = a[0];
        for(int i = 1; i < N; i++){
            int cal = X - a[i];
            cal = Math.abs(cal);
            if(cal <= K){
                count++;
                X = a[i];
                
            }
        }
        
        System.out.println(count);

    }
    
}
