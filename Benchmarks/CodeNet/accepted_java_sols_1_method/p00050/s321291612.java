
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    
    public static void main(String[] args)  {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
                line=line.replaceAll("apple", "xyzxyzzzyxxxxzxzaa2b");
                line=line.replaceAll("peach",
                        "apple");
                line=line.replaceAll("xyzxyzzzyxxxxzxzaa2b","peach");
                System.out.println(line);
                

            }
        }catch(Exception e){}
        
    }
}