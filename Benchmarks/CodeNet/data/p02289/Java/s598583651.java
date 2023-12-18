import java.io.*;
import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    
    Vector<String> array = new Vector<String>();
    
    String string = " ";
    
    while(!string.equals("end")) {
        string = in.next();
        if (string.equals("insert")) { 
            String number = in.next();
            array.add(number);
            if (array.size() > 1 && Long.parseLong(number) < Long.parseLong(array.get(array.size() - 2))) {
                if (array.size() != 2) {
                    swap(array,array.size()/2,array.size() - 1);
                } else {
                    swapFinal(array,array.size() - 2,array.size() - 1);
                }
            }
            in.nextLine();
        } else if (string.equals("extract")){
            System.out.println(array.get(array.size() - 1));
            array.remove(array.size() - 1);
        }
        
    }
    
      
  }
  
  public static void swap(Vector<String> array,int cursor,int pos) {

    if (Long.parseLong(array.get(cursor)) > Long.parseLong(array.get(pos))) {
        if (cursor != 0) {    
            swap(array,cursor - 1,pos);
        } else {
            swapFinal(array,cursor,pos);
        }
    } else {
        swapFinal(array,cursor + 1,pos);
    }

  }
  
  public static void swapFinal(Vector<String> array,int cursor,int pos) {
    
    if (cursor != pos) {
        String a = array.get(pos);
        array.set(pos,array.get(pos - 1));
        array.set(pos - 1,a);
        swapFinal(array,cursor,pos - 1);
    }
  }
  
}
