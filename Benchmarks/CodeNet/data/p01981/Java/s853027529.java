import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			String a=sc.next();
			if(a.equals("#")) {
				break;
			}
			int y=sc.nextInt();
			int m=sc.nextInt();
			int d=sc.nextInt();

			if(y<=30) {
				System.out.println(a+" "+y+" "+m+" "+d);
			}

			else if(y==31 && m<=4) {
				System.out.println(a+" "+y+" "+m+" "+d);
			}
			else {
				System.out.println("? "+(y-30)+" "+m+" "+d);
			}
		}
	}
}
