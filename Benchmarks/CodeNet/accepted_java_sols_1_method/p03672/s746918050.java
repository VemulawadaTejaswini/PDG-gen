import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int check=0;
		for(int i=s.length()-1;i>=2;i--) {
			int cnt=0;
			if(i%2==0) {
				for(int j=0;j<i/2;j++) {
					if(s.charAt(j) == s.charAt(i/2+j)) {
						check=i;
						cnt++;
					}else break;
				}
			}
			if(cnt==i/2)break;
		}
		System.out.println(check);
	}
}