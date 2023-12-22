import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt(),y=stdIn.nextInt(),d;
		if(y>x){
			d=x;
			x=y;
			y=d;
		}
		while(y>0){
			d=x%y;
			x=y;
			y=d;
		}
		System.out.println(x);
	}
}
