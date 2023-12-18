import java.util.*;
public class Main{
	
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      if((s.length()>=3)&&(s.length()<=20)){
        String ans=s.substring(0,3);
		System.out.println(ans);
      }
    }
}