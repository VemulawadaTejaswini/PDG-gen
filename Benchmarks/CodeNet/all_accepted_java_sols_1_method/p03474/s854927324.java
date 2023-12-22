import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		String s=sc.next();
		int cnt=0;
		for(int i=0;i<(a+b+1);i++) {
			if(i==a) {
				if(s.charAt(i)=='-') {
					cnt++;
				}
			}else {
				if(s.substring(i,i+1).matches("[0-9]")) {
					cnt++;
				}
			}
		}
		System.out.println(cnt==s.length()?"Yes":"No");
	}
}