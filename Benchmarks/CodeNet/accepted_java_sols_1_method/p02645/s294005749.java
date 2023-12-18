import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String X = sc.next();
      	String ans = "";
      	for(int i=0;i<3;i++){
          ans += X.charAt(i);
        }
      	System.out.println(ans);    	
	}
}