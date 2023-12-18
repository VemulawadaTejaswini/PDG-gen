import java.io.*;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s = br.readLine();
            int a , b ,temp;
            int r = 0;
          
            StringTokenizer st = new StringTokenizer(s," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            while(a!=0)
            {
            	if(a<b)
            	{
            		temp = a;
            		a = b;
            		b = temp;
            	}
            
            	a = a - b;
            	
            }
            System.out.println(b);
    	}catch (Exception e) {
            e.printStackTrace();
        }
       
    }
   

}