import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
                int answer = 0;
		if(n/100 == 9){
			answer = 100;
			n=n-900;
		}else{
			answer = 900;
			n=n-100;
		}
		if(n/10 == 9){
			answer = answer+10;
			n=n-90;
		}else{
			answer = answer+90;
			n=n-10;
		}
		if(n == 9){
			answer = answer+1;
			
		}else{
			answer = answer+9;
		}
		System.out.println(answer);
	}
}