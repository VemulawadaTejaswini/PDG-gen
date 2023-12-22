import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		int a=0;
		for(int i=0;i<(len-1)/2;i++) {
			if((char)s.charAt(i)!=(char)s.charAt(len-1-i)) {
				a=-1;
				break;
			}
		}
		for(int i=0;i<(len-1)/4;i++) {
			if((char)s.charAt(i)!=(char)s.charAt(((len-1)/2)-i-1)) {
				a=-1;
				break;
			}
		}
		for(int i=0;i<(len-1)/4;i++) {
			if((char)s.charAt(((len+3)/2)+i-1)!=(char)s.charAt(len-1-i)){
				a=-1;
				break;
			}
		}
		if(a==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
