import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int s = sc.nextInt();

		if(s == 1){
			System.out.println(4);
		}else if(s ==2){
			System.out.println(4);
		}else
		{
			int count =1;
			do {
				if(s%2 ==0){
					s = s/2;
				}else{
					s = s*3 +1;
				}
			
				count++;
			} while (s!=1);
			System.out.println(count + 1);

		}

	}
}