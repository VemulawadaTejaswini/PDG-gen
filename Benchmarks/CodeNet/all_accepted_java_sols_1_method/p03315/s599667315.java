import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int sum = 0;
      for(int i = 0;i < 4; i++){
      	String s = str.substring(i,i+1);
        if(s.equals("+")) sum++;
        if(s.equals("-")) sum--;
      }
      System.out.println(sum);
      sc.close();
    }
}
