import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		String b=scan.next();
		int ans=0;
		int count=0;
		for(int i=0;i!=b.length();i++) {
			if(b.charAt(i)=='A') {
				ans=i;
				break;
			}
			}
		for(int i=b.length()-1;i!=0;i--) {
			if(b.charAt(i)=='Z') {
				count=i;
				break;
			}
		}
		System.out.println(count-ans+1);
	}
}