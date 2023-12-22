import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		/* ＜考察＞
		 * 9589,9479 9599は8999の方が大きいし、9479は8999の方がやはり値が大きい。
		 * 9が出来るだけ多く出るようにしたい。その次に８が多くなるように数字を出すには...。
		 * ex)4桁の場合
		 * 8245などは一番左のけたを1減らすことによりそれ以降を全部9に変えることが出来る。
		 * 	これが最適では？
		 * 
		 * かといって8999のようなときに桁をずらす必要はないため最適な状況を除いて一番左だけーにする。						
		*/		
		
		
		String n = stdIn.next();
		
		if(n.length()==1) {
			System.out.println(n);
			return;
		}
		
		String numb = "";
		for(int i = 0; i < n.length()-1; i++) {
			numb +="9";
		}
		long n2 = Long.parseLong(n);
		
		String n3 = n.substring(1);
		long ans = 0;
		
		
		if(numb.equals(n3)) {
			while(n2 > 0) {
				ans += n2%10;
				n2/=10;
			}
			System.out.println(ans);
			return;
		}
		
		
		
		int num = Integer.parseInt(n.substring(0,1));
		
		num--;
		
		if(num== 0) {
			ans = (long)9*(n.length()-1); 
		}
		
		
		ans = Math.max(ans,num+(9*(n.length()-1)));
		
		System.out.println(ans);
		
		
		
		
		
	}

}
