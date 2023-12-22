import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),s=0,t=n;
		do {
			s+=t%10;
			t/=10;
		}while(t!=0);
		System.out.print(n%s==0?"Yes":"No");
	}
}