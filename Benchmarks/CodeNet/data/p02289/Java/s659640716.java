import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    
    Vector array = new Vector();
    //Vector<Integer> array = new Vector<>(); 
    
    String string = " ";
    
    while(!string.equals("end")) {
        string = in.next();
        if (string.equals("insert")) { 
            long number = in.nextInt();
            array.add(number);
            if (array.size() > 1 && number < (long) array.get(array.size() - 2)) {
                
                int pos1 = array.size() - 2, pos2 = array.size() - 1;
      
                while (pos1 >= 0 && (long) array.get(pos1) > (long) array.get(pos2)) {
                    long a = (long) array.get(pos1);
                    array.set(pos1,array.get(pos2));
                    array.set(pos2,a);

                    
                    pos1--;
                    pos2--;
                }
                
            }
            in.nextLine();
        } else if (string.equals("extract")){
            System.out.println(array.get(array.size() - 1));
            array.remove(array.size() - 1);
        }
        
    }
    
  }
  
}
