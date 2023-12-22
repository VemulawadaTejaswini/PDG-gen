import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int count = 0;
		int res = 0;
		
		for(int i =0;i<S.length();i++) {
			char c = S.charAt(i);
			if(c=='A'||c=='G'||c=='C'||c=='T') {
				count++;
			}else {
				res = Math.max(res, count);
				count=0;
			}
		}
		
		res = Math.max(res, count);
		System.out.println(res);


		}


}