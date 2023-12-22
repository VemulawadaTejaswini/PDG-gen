import java.util.Scanner;
public class Main {
	static int[][] gyo2=new int[100000][12];
	static int count=0;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String T=sc.next();
		String[] s=S.split("");
		String[] t=T.split("");
		for(int i=0;i<s.length;i++) {
			if(!s[i].equals(t[i])) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");

}

}
