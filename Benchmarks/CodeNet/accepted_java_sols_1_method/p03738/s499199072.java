import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();

		String ans="EQUAL";//A>B true B<A false

		if(A.length()>B.length()){
			ans = "GREATER";
		}else if(A.length()<B.length()){
			ans = "LESS";
		}else{
			//桁数が同じ
			for(int i=0;i<A.length();i++){
				int a =Integer.parseInt(A.substring(i, i+1));
				int b =Integer.parseInt(B.substring(i, i+1));
				if(a>b){
					ans ="GREATER";
					break;
				}else if(a<b){
					ans ="LESS";
					break;
				}
			}
		}


		System.out.println(ans);

	}

}
