import java.io.*;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s = br.readLine();
            int a , b , min_num,temp;
            int r = 0;
            while(s!=null)
            {
            StringTokenizer st = new StringTokenizer(s," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            min_num = Math.min(a, b);
            	if(a<b)
            	{
            		temp = a;
            		a = b;
            		b = temp;
            	}
            
            	while(b>0)
            	{
            		r = a%b;
            		a = b;
            		b = r;
            		
            	}
            	System.out.println(a);
            	break;
            }
    	}catch (Exception e) {
            e.printStackTrace();
        }
       
    }
   

}