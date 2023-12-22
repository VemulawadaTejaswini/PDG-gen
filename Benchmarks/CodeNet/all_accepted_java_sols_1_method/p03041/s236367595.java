import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		scan.nextLine();
		String s= scan.nextLine();
		String t="";
		for(int i=0;i<n;i++) {
			if(i==k-1) {
			t+=s.toLowerCase().charAt(i);
			}
			else {
				t+=s.charAt(i);
			}
		}
		System.out.println(t);
	

}
}