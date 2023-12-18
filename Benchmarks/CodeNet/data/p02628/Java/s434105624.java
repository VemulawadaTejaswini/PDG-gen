import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] y = new int[n];
        int ans=0;
        
        for(int i=0; i<n; i++){
            y[i] = sc.nextInt();
        }
        
        Arrays.sort(y);
        for(int i=0; i<3; i++){
            ans+=y[i];
        }
        
        System.out.println(ans);
   }
}
