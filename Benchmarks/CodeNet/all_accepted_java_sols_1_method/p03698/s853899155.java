import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		int check[]=new int[26];
		for(int i=0;i<26;i++) {
			check[i]=0;
		}
		int x=0;
		for(int i=0;i<s.length();i++) {
			int num= s.charAt(i)-'a';
			check[num]+=1;
			if(check[num]==2) {
				x=1;
				break;
			}
		}
		System.out.println((x==1)? "no":"yes");
	}
}