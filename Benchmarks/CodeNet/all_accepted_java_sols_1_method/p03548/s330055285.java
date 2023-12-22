import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt(),y=stdIn.nextInt(),z=stdIn.nextInt(),i;
		for(i=1;x>=y*i+z*(i+1);i++) ;
		System.out.print(i-1);
	}
}