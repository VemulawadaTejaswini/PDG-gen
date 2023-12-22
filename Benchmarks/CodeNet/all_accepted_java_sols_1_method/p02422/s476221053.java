import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int loop = sc.nextInt();
		String comnd;
		for(int i=0;i<loop;i++) {
			comnd = sc.next();
			int n,m;
			n=sc.nextInt();
			m=sc.nextInt();
			if(comnd.equals("print")) {

				for(int j=n;j<=m;j++) {
					System.out.print(str.charAt(j));
				}
                System.out.println();
			}else if(comnd.equals("replace")) {

				String rep = sc.next();
				String tmp =str.substring(0, n) + rep + str.substring(m+1,str.length());
				str = tmp;
			}else if(comnd.equals("reverse")) {
				
				StringBuffer sb = new StringBuffer(str.substring(n,m+1));
				
				str = str.substring(0, n) + sb.reverse().toString() + str.substring(m+1,str.length());
			}
		}
		sc.close();

	}

}
