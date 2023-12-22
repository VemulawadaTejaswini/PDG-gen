import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      //文字列
      String s =sc.nextLine();
      int c = 0;
      if(s.charAt(0) == '1'){
      	c++;
      }
      if(s.charAt(1) == '1'){
      	c++;
      }
      if(s.charAt(2) == '1'){
        c++;
      }
      
      System.out.print(c);
		
	}
}
