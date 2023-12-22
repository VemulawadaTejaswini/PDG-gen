import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
   
public class Main {
       
     
    public static void main(String[] args) {
            
          try {
                 
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
            String s = null;
            String now = "A";
            
            while((s = br.readLine())!=null){
       		 StringTokenizer st = new StringTokenizer(s,",");
       		 String first = st.nextToken();
       		 String second = st.nextToken();
       		 if(now.equals(first))
       		 {
       			 now = second;
       			 
       		 }
       		 else if(now.equals(second))
       		 {
       			 now = first;	
       		 }
       		
            }
            System.out.println(now);
          }catch (Exception e) {
              e.printStackTrace();
            }
        }
      
}
    