import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      for(char c = 'a';c <= 'z';c++){
      	if(s.indexOf(c)==-1){
        	System.out.println(c);
          return;
        }
      }
      System.out.println("None");
    }
}
