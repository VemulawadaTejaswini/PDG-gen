import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),a,max=0,min=1000,i;
		for(i=0;i<n;i++) {
			a=stdIn.nextInt();
			if(a>max) max=a;
			if(min>a) min=a;
		}
		System.out.print(max-min);
	}
}