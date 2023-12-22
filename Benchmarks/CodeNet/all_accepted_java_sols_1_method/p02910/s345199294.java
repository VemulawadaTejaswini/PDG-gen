import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		int i,flag=0;
		char s;
		for(i=0;i<S.length();i++){
			s=S.charAt(i);
			if(i%2==0&&s=='L'){
				flag=1;
			}
			if(i%2==1&&s=='R'){
				flag=1;
			}
		}
		if(flag==0)System.out.print("Yes");
		else System.out.print("No");
	}
	
}