
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

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
            int n =Integer.parseInt(in.readLine());
            StringTokenizer st;
            int data[] =new int[3];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(in.readLine());
                for (int j = 0; j < 3; j++) {
                    data[j]=Integer.parseInt(st.nextToken());;
                }
               
                Arrays.sort(data);
                
                if((long)data[0]*data[0] + data[1]*data[1]==(long)data[2]*data[2])
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            
            
        }
     }
}