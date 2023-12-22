import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)=='A') {
				if(i!=0) {
					n=n.substring(i);
				}
				break;
			}
		}
		for(int j=0;j<n.length();j++) {
			if(n.charAt(n.length()-1-j)=='Z') {
				n=n.substring(0,n.length()-j);
				break;
			}
		}
		System.out.println(n.length());
		sc.close();
	}
}