import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long min = 10000000000000000L;
		int p = 0;
		long n = sc.nextLong();

		// 整数の入力
		for(int t=0;t<5;t++){
			long val = sc.nextLong();
			if(val<min){
				min=val;
			}
		}

		// 出力
		System.out.println(n%min==0?n/min+4:n/min+5);
	}
}