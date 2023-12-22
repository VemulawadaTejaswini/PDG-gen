import java.util.Scanner;
public class Main{
	public static int Int(char a){
		int i=0;
		if(a=='+') {
		i=1;
		}
		else {
			i=-1;
		}
		return i;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		int ans=0;
		ans+=Int(a.charAt(0));
		ans+=Int(a.charAt(1));
		ans+=Int(a.charAt(2));
		ans+=Int(a.charAt(3));
		System.out.println(ans);
	}
}