import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),a,i,min=1000000000,max=0;
		for(i=0;i<n;i++) {
			a=stdIn.nextInt();
			if(min>a) min=a;
			if(a>max) max=a;
		}
		System.out.print(max-min);
	}
}