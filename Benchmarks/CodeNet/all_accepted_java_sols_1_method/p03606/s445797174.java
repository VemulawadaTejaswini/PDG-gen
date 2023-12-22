import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),l,r,s=0,i;
		for(i=0;i<n;i++) {
			l=stdIn.nextInt();
			r=stdIn.nextInt();
			s+=r-l+1;
		}
		System.out.print(s);
	}
}