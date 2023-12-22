import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		String s = sc.next();
      	String t = sc.next();
      
		for(int i = 0; i < s.length(); i++){
        	if(s.equals(t)){
              System.out.println("Yes");
              return;
            }else{
              s = s.charAt(s.length()-1) + s.substring(0, s.length()-1);
            }
        }
      System.out.println("No");
     }
}