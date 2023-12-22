import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * bit全探索サンプル
 * atcoder C - たくさんの数式
 *
 */
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		long length = s1.length();
		
		long totalAll =0;
		// 1<<n == Math.pow(2,n)
		// 1をnだけ左にビットシフトする -> 2のn乗の事
		// 2進数で）0001 -> 1000
		for(int i=0; i<(1<<length-1); i++){
			List<String> list = new ArrayList<>();
			for(int j=0; j<length-1; j++){
				list.add(s1.substring(j,j+1));
				if((1& i>>j) == 1){
//					System.out.print("1");
					list.add("+");
				} else {
//					System.out.print("0");
				}
			}
			list.add(s1.substring(s1.length()-1,s1.length()));
//			System.out.println(list);
			String aa = "";
			long total = 0;
			for(String a:list){
				if(a.equals("+")){
					total += Long.parseLong(aa);
					aa = "";
				} else {
					aa += a;
				}
			}
			if(!aa.equals("")){
				total += Long.parseLong(aa);
			}
			totalAll += total;
		}
		System.out.println(totalAll);
	}
}
