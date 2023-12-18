/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wijebandara
 */
public class Main {
    public static void main(String[] args) {
        try {
            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            
            int data[]=new int [1000000];
            
            for (int i = 2; i < 1000000; i++) {
                if(isp(i))
                {
                    data[i]=data[i-1]+1;
                }
                else
                {
                    data[i]=data[i-1];
                }
            }
            String s =in.readLine();
            while(s!=null)
            {               
                System.out.println(data[Integer.parseInt(s)]);
                s =in.readLine();
            }
            
            
        } catch (Exception ex) {
            System.exit(0);
        }
    }
    static boolean isp(int x)
    {
        int a =(int)Math.sqrt(x);
        for (int i = 2; i <=a; i++) {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}