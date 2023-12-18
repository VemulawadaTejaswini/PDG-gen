
import java.lang.*;
import java.util.*;
public class Main
{
    static Scanner sc = new Scanner(System.in);
        
    public static void main(String args[])
    {

        while(true){
            
            int p = sc.nextInt();
            int n = sc.nextInt();
            
            if(p==0 && n ==0) break;
            int[] a = new int[21];
            
            for(int c=0; c<21; c++){
                if(c==0) a[0] = p;
                else{
                    p = a[c-1];
                    int[] s = new int[10];
                    
                    for(int i=0; i<n; i++){
                        if(p == 0) s[0]++;
                        else{
                            s[p%10]++;
                            p /= 10;
                        }
                    }
                    
                    int max = 0;
                    for(int i=9; i>=0; i--){
                        if(s[i] == 0) continue;
                        if(s[i] > 0){
                            while(s[i]-- > 0){
                                max += i;
                                max *= 10;
                            }
                        }
                    }
                    
                    a[c] += max/10;
                    int min = 0;
                    for(int i=0; i<n; i++){
                        if(max == 0)break;
                        
                        max /= 10;
                        min += max % 10;
                        min *= 10;
                    }
                    
                    
                    a[c] -= min/10;
                    
                    boolean f = false;
                    for(int i=0; i<c; i++){
                        
                        if(a[i] == a[c]){
                            f = true;
                            System.out.println(i + " " + a[c] + " " + (c-i) );    
                        }
                    }
                    if(f) break;  
                    
                }
            }
        }
    }
    
}