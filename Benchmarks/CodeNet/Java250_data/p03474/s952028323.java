import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		String S=sc.next();
		S.toCharArray();
		String h="-";
		int cnt=0;
		for(int i=0;i<S.length();i++) {
			char c = S.charAt(i);
			if(h.equals(String.valueOf(c))) {
				cnt++;
			}
		}
		if(S.indexOf("-")+1==A+1 && S.length()==A+B+1 && cnt==1) {
			System.out.println("Yes");
		}else System.out.println("No");
	}
}
