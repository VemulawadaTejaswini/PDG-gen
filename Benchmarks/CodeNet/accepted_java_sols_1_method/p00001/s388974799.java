
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wijebandara
 */
public class Main {
     public static void main(String[] args) throws IOException {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        {
            int data[] =new int [4];
            for (int i = 0; i < 10; i++) {
                int p =Integer.parseInt(in.readLine());
                int k=2;
                while(k>=0 && data[k]<p)
                {
                    data[k+1]=data[k];
                    k--;
                }
                data[k+1]=p;
                
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(data[i]);
            }
            
            
        }
     }   
        
        
    
}