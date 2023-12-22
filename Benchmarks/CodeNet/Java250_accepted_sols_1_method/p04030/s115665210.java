import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int check[]=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='B') {
				check[i]=-1;
				for(int j=i-1;j>=0;j--) {
					if(check[j]==0) {
						check[j]=-1;
						break;
					}
				}
			}
			else check[i]=0;
		}
		for(int i=0;i<s.length();i++) {
			if(check[i]==0)System.out.print(s.charAt(i));
		}
		System.out.println();
	}
}