import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
                int answer = 0;
		int digit = n/100;
		n = n - digit*100;
                if(digit*10+ digit >= n){
			answer = digit*100+ digit*10 + digit;
		}else{
			answer = (digit+1)*100+ (digit+1)*10 + digit+1;
		}
		System.out.println(answer);
	}
}