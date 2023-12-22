import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			int x = in.nextInt();
			int y = in.nextInt();
			
			int greatCD = 1; // 最大公約数
			int cd = 2;      // 公約数
			int min = x < y ? x : y;
			
			while(cd <= min) { 	
				for(cd = 2; cd <= min; cd++) {
					// cdはxとyの公約数か判断。
					if ((x % cd) == 0 && (y % cd) == 0) {
						//cdが公約数だったら、xとyをcdで割り、次の計算に備える。
						x = x / cd;
						y = y / cd;
						greatCD = greatCD * cd; // 算出した公約数を今まで求めた公約数の値に掛け合わせる
						min = min / cd;
						break;
					}
				}
			}
			
			// 最小公倍数は、最大公約数と最後に算出したxとyの値を掛け合わせることで算出できる。
			int lcd = greatCD * x * y;
			
	   		System.out.printf("%d %d\n", greatCD, lcd);
		}
	}
}