import java.util.*;

public class Main{
    
    static final int MAX = (int)1e3*5;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        int[] imo = new int[MAX];
        for(int i=0; i<n; i++){
            l[i] = Integer.parseInt(sc.next());
            imo[l[i]]++;
        }
        
        for(int i=0; i+1<MAX; i++){
            imo[i+1] += imo[i];
        }
        
        long ans = 0;
        for(int i=0; i<n;i++){
            int a = l[i];
            for(int j=i+1; j<n; j++){
                int b = l[j];
                int cmax = a+b-1;
                int cmin = Math.max(a-b+1, b-a+1);
                ans += imo[cmax] - imo[cmin-1];
                if(cmin<=a && a<=cmax) ans--;
                if(cmin<=b && b<=cmax) ans--;
            }
        }
        
        System.out.println(ans/3);
    }
}
