import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String n = sc.next();
        int i;
		
      	if(n.length() >= 3){
          StringBuilder b;
          b = new StringBuilder(n);
          n = b.reverse().toString();
          
        }
      	
		
        System.out.println(n);

      	
 
    }
}