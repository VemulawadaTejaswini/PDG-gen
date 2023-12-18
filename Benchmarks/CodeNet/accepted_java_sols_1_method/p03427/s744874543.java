import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String n = String.valueOf(sc.nextLong()+1);
      String m = n.substring(0,1);
      System.out.println(Integer.parseInt(m)-1+(n.length()-1)*9);
    }
}
