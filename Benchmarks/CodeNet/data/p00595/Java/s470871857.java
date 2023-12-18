import java.io.*;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s = br.readLine();
            int a , b , min_num;
            while(s!=null)
            {
            StringTokenizer st = new StringTokenizer(s," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            min_num = Math.min(a, b);
           
            for(int d = min_num; d>0; d--)
            {
                 if(a%d==0 && b%d==0)
                 {
                	 System.out.println(d);
                	 break;
                 }
        
            }
            break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
   

}