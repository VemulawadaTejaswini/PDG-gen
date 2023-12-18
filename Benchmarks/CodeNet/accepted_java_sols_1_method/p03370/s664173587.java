import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int[] m = new int[n];
        
        for(int i = 0; i < n; i++) { 
            m[i] = sc.nextInt();
            x-=m[i];
            
        }
        
        int res = n;
        
        Arrays.sort(m);
        
        res+=x/m[0];
        
        System.out.println(res);
        
    }
}
