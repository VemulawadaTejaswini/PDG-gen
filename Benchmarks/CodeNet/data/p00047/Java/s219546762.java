import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
    
public class Main {
        
      
    public static void main(String[] args) {
             
          try {
                  
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
            String s = null;
            ArrayList<String> motoList = new ArrayList<String>();
            motoList.add("A");
            motoList.add("B");
            motoList.add("C");
             
            while((s = br.readLine())!=null)
            {
             StringTokenizer st = new StringTokenizer(s,",");
             String first = st.nextToken();
             String second = st.nextToken();
             int firstIndex = motoList.indexOf(first);
             int secondIndex = motoList.indexOf(second);
             String temp = null;
             temp = motoList.get(firstIndex);
             motoList.set(firstIndex,motoList.get(secondIndex));
             motoList.set(secondIndex,temp);
             //System.out.println(motoList);
             //System.out.println(motoList.indexOf("A"));
            }
          
         int finalIndex = motoList.indexOf("A");
          
         if(finalIndex == 0)
         {
             System.out.println("A");
             System.exit(0);
         }
         else if(finalIndex == 1)
         {
             System.out.println("B");
             System.exit(0);
         }
         else
         {
             System.out.println("C");
             System.exit(0);
         }
             
            
                  
            }catch (Exception e) {
              e.printStackTrace();
            }
        }
       
        
    
 
        
       
}