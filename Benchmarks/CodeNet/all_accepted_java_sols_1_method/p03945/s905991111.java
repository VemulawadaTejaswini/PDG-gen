import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();

		int stat=0;
		int henko=0;
		if(a.charAt(0)=='B') {
			stat=0;
		}
		else {
			stat=1;
		}

		for(int i=1; i<a.length(); i++) {
			if(a.charAt(i)=='B' && stat==0) {
				//
			}
			else if(a.charAt(i)=='B' && stat==1) {
				henko++;
				stat=0;
			}
			else if(a.charAt(i)=='W' && stat==1) {
				//
			}
			else if(a.charAt(i)=='W' && stat==0) {
				henko++;
				stat=1;
			}
		}
		System.out.println(henko);
	}
}