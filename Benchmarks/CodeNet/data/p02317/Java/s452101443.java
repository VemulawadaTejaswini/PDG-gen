import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d[] = new int[n+1];
        int t[] = new int[n];
        
        for (int i = 0; i < n; i++){
            d[i]=in.nextInt();
        }
        
        t[0] = d[0];
        int length = 1;
        
        for(int i = 0; i < n; i++){
            if (t[length-1] < d[i]){
                t[length++] = d[i];
            }else{
                for (int j = 0; j <= length-1; j++){
                    if (t[j]>=d[i]){
                        t[j]=d[i];
                        break;
                    }                    
                }
            }
        }
        
        System.out.println(length);
    }  
}