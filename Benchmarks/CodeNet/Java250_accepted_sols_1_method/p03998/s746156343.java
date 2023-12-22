import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		char[] sa = a.toCharArray();
		char[] sb = b.toCharArray();
		char[] sc = c.toCharArray();
		int countA = 0;
		int countB = 0;
		int countC =0;

		for(int i=0,m=-1,n=-1;;) {
			if(sa[i]=='a') {

				sa[i]='x';
				i++;
				//System.out.println(1);
				if(i==sa.length) {
					System.out.println("A");
					break;
				}

			}else if(sa[i]=='b') {

				sa[i]='x';
			m++;
				//System.out.println(2);
				if(m==sb.length) {
					System.out.println("B");
					break;
				}
			}else if(sa[i]=='c') {

				sa[i]='x';
				n++;
				//System.out.println(3);
				if(n==sc.length) {
					System.out.println("C");
					break;
				}
			}

				if(m>=0) {
				if(sb[m]=='a') {

					sb[m]='x';
					i++;
					//System.out.println(4);
					if(i==sa.length) {
						System.out.println("A");
						break;
					}

				}else if(sb[m]=='b') {

					sb[m]='x';
					m++;
					//System.out.println(5);
					if(m==sb.length) {
						System.out.println("B");
						break;
					}
				}else if(sb[m]=='c') {

					sb[m]='x';
					n++;
					//System.out.println(6);
					if(n==sc.length) {
						System.out.println("C");
						break;
				}
				}
				}
					if(n>=0) {
					if(sc[n]=='a') {

					sc[n]='x';
					i++;
					//System.out.println(7);
					if(i==sa.length) {
						System.out.println("A");
						break;
					}

				}else if(sc[n]=='b') {

					sc[n]='x';
					m++;
					//System.out.println(8);
					if(m==sb.length) {
						System.out.println("B");
						break;
					}
				}else if(sc[n]=='c') {

					sc[n]='x';
					n++;
					//System.out.println(9);
					if(n==sc.length) {
						System.out.println("C");
						break;
			}
		}

	}

}
	}
}
