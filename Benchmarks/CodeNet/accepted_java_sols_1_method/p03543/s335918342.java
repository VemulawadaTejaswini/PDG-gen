import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),a[]=new int[4],i=0;
		do {
			a[i]=n%10;
			i++;
			n/=10;
		}while(n!=0);
		System.out.print(a[0]==a[1]&&a[1]==a[2]||a[1]==a[2]&&a[2]==a[3]?"Yes":"No");
	}
}