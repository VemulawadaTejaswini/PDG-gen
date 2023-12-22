import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int b=scan.nextInt();
		for(int j=0;j<b;j++) {
			String CH=scan.next();
			if(CH.equals("replace")) {
				int a=scan.nextInt();
				int c=scan.nextInt();
				String s=scan.next();
				str=str.substring(0,a)+s+str.substring(c+1,str.length());
			}
			if(CH.equals("reverse")) {
				int a=scan.nextInt();
				int c=scan.nextInt();
				String S=str.substring(a,c+1);
				StringBuffer sb=new StringBuffer(S);
				sb=sb.reverse();
				S=sb.toString();
				str=str.substring(0,a)+S+str.substring(c+1,str.length());
			}
			if(CH.equals("print")) {
				int a=scan.nextInt();
				int c=scan.nextInt();
				System.out.println(str.substring(a,c+1));
			}
		}
	}
}
