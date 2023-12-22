import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Map <Integer,Integer> mapL = new HashMap<Integer,Integer> ();
 
		Scanner sc = new Scanner(System.in);
			// 整数の入力
			long a,b,c,d,r,m,max,num1,num2,num3,index;
			long result,result1,result2;
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			d = sc.nextLong();
			sc.close();
			if(c>d) {
				m=c;
				r=d;
			}
			else {
				m=d;
				r=c;
			}
			for(index=0;;index++) {
				if(r==1) {
					result=1;
					break;
				}
				if(m%r==0) {
					result=r;
					break;
				}
				result=m%r;
				m=r;
				r=result;
			}
			max=c*d/result;
			//System.out.println(max);

			num1=b/c;
			num2=b/d;
			num3=b/max;
			result1=b-(num1+num2-num3);
			num1=(a-1)/c;
			num2=(a-1)/d;
			num3=(a-1)/max;
			result2=(a-1)-(num1+num2-num3);
			//System.out.println(result1);
			//System.out.println(result2);
			System.out.println(result1-result2);
			
 
			// 出力
 
	}
}