import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int l=(n-1)/2;
		int r=n/2;
		char c=s.charAt(l);
		while(0<=l) {
			if(s.charAt(l)==c&&s.charAt(r)==c) {
				l--;r++;
			}
			else {
				break;
			}
		}
		System.out.println(r);
		}
	}
