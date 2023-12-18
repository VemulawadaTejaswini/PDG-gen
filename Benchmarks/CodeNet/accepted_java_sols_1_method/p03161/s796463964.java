/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package here;

/**
 *
 * @author sokumar
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []h = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            h[i] = sc.nextInt();
        }
        int []c = new int[n+1];
        c[1] = 0;
        for(int i=2;i<=n;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=i-1;j>=Math.max(1, i-k);j--)
            {
      
               min = Math.min(min,c[j] + Math.abs(h[i]-h[j]));
            
            }
            c[i] = min;
           // w.print(c[i] + " ");
        }
       w.println(c[n]);
        
        w.close();
    }
    
}
