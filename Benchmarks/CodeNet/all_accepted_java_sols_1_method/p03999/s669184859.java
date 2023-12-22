import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String[] S=sc.next().split("");
		long ans=0;

		for(int i=0;i<Math.pow(2,S.length-1);i++) {

			StringBuilder sb=new StringBuilder();

			for(int j=0;j<S.length;j++) {

				sb.append(S[j]);

				if((1&i>>j)==1) {

					ans+=Long.parseLong(sb.toString());
					sb.setLength(0);
				}
			}
			if(sb.length()!=0) {
				ans+=Long.parseLong(sb.toString());
			}
		}

		System.out.println(ans);

		sc.close();
	}
}