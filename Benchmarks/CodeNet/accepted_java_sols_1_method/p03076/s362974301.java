import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] s = new int[5];
		int min = 10;
		int p = 0;

		// 整数の入力
		for(int n=0;n<5;n++){
			s[n] = sc.nextInt();
			int val = s[n]%10;
			if(val<min&&val!=0){
				p=n;
				min=val;
			}
		}
		if(min==10)min=0;
		int sum = 0;

		for(int n=0;n<5;n++){
			if(n!=p&&s[n]%10!=0){
				sum=sum+s[n]+10-s[n]%10;
			} else {
				sum+=s[n];
			}
		}

		// 出力
		System.out.println(sum);
	}
}