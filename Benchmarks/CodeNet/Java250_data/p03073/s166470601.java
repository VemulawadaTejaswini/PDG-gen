import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int res = 0;
		String str = sc.next();
		int[] N = new int[str.length()];

		for(int i = 0;i<str.length();i++) {
			N[i]=str.charAt(i)-'0';
			//System.out.println(N[i]);
		}
		for(int n = 0;n<str.length()-1;n++) {
			if(N[n]==N[n+1]&&N[n+1]==0) {
				N[n+1]=1;
				res++;
			}else if(N[n]==N[n+1]&&N[n+1]==1) {
				N[n+1]=0;
				res++;
			}
		}

		System.out.println(res);
	}
}