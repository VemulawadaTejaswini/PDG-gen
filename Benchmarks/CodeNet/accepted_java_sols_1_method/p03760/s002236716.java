import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String odd = sc.next();
		String even = sc.next();
		int len = odd.length() + even.length();
		int oc = 0;
		int ec = 0;
		String ans = "";
		for(int i =1; i <= len;i++){
			String c;
			if(i % 2 == 0){//偶数
				if(ec == len){
					c = even.substring(ec);
				}else{
					c = even.substring(ec, ec+1);
				}
				ans = ans + c;
				ec++;
			}else{//奇数
				if(oc == len){
					c = odd.substring(oc);
				}else{
					c = odd.substring(oc, oc+1);
				}
				ans = ans + c;
				oc++;
			}
		}
		System.out.println(ans);
	}

}
