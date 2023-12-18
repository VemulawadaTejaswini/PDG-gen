import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Y
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = new int[n];
        int[] y = new int[n];
        String[] s = new String[n];
        
        s = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            x[i] = Integer.parseInt(s[i]);
        }
        
        s = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            y[i] = Integer.parseInt(s[i]);
        }
        
        for(int i = 1;i<=3;i++){
            minkowski(i,x,y);
        }
        
        int[] z = new int[n];
        double D = 0;
        for(int i = 0;i<x.length;i++){
            z[i] = Math.abs(x[i]-y[i]);
            
            D = Math.max(z[i],D);
            
        }
        System.out.println(D);
        
        
        
    }
    
    static void minkowski(int p, int[] x, int[] y){
        int n = x.length;
        double D=0;
        for(int i = 0;i<n;i++){
            D += Math.pow( Math.abs(x[i]-y[i]), p );
        }
        D = Math.pow(D,1.0/p);
        System.out.println(D);
    }
             
}