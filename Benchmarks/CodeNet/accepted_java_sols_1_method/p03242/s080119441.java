import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int result =0;
		result += n/100==1? 900:100;
		result += (n/10)%10==1? 90:10;
		result += n%10==1? 9:1;

		System.out.println(result);



	}

}