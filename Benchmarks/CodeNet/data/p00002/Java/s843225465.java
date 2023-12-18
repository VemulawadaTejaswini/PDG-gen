import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
    	
    	
    	 Scanner sc = new Scanner(System.in);
    	 int count = 0;
    	 
         while (sc.hasNext() && count<201){
             String s = sc.nextLine();
             String[] array = s.split(" ");
             
             int a = Integer.parseInt(array[0]);
             int b = Integer.parseInt(array[1]);
             
             int valLen = String.valueOf(a+b).length();
             System.out.println(valLen);
             
             count++;
        	 }
    }
}