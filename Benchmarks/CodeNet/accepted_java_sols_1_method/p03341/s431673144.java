import java.util.*;

public class Main{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int inf = (int)1e9;
        
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        
        int[] w = new int[n+1];
        int[] e = new int[n+1];
        for(int i=0; i<n; i++){
            w[i+1] = w[i];
            e[i+1] = e[i];
            char c = s.charAt(i);
            if(c=='W'){
                w[i+1]++;
            }else{
                e[i+1]++;
            }
        }
        
        int wal = w[n];
        int eal = e[n];
        int min = (int)1e9;
        for(int i=0; i<n; i++){
            //System.out.println(w[i+1] + ":" + e[i+1]);
            if(s.charAt(i)=='W'){
                int tmp = eal-e[i] + w[i];
                //System.out.println(tmp);
                min = Math.min(min, tmp);
            }else{
                int tmp = eal-e[i+1] + w[i+1];
                //System.out.println(tmp);
                min = Math.min(min, tmp);
            }
        }
        System.out.println(min);
    }
}