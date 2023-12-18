import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Test  
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String s =reader.readLine();
      //System.out.println(s.toLowerCase());
      s=s.toLowerCase();
     //if(s.charAt(s.length()-1)=='s')
     if(s.lastIndexOf('s')==s.length()-1)
       s=s+"es";
       // System.out.println(s.lastIndexOf('s')==s.length()-1);
       // System.out.println(s.lastIndexOf('s'));
            //System.out.println(s.length()-1);
     else
       s=s+"s";
      // System.out.println(s.charAt(s.length()-1)); 
      System.out.println(s);
    }
}