import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      String[] s = new String[n];
      for(int i = 0; i < n;i++){
        s[i] = sc.next();
        if(s[i].equals("Y"))count++;
      }
      if(count > 0)System.out.println("Four");
      else System.out.println("Three");
    }
}