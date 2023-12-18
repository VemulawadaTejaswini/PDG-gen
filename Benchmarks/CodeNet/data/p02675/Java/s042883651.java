import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char n = N.charAt(N.length - 1);
		String ans = " ";
		if(n == '2' || n == '4' || n == 5 || n == 7 || n == 9){
			ans = "hon";
		}else if(n == 3){
			ans = "bon";
		}else{
			ans = "pon";
		}
		System.out.println(ans);
	}
}