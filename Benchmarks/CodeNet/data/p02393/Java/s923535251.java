import java.io.*;
import java.lang.*; 
 
class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        String[ ] str_div = br.readLine().split(" ");
        String[ ] str_div_sorted = str_div.sort();
????????????
        int x = Integer.parseInt(str_div_sorted[0]);
        int y = Integer.parseInt(str_div_sorted[1]);
        int z = Integer.parseInt(str_div_sorted[2]);
        
        System.out.println(x + " " + y + " " + z);
 }
}
   