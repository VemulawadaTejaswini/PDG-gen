import java.util.Scanner;

class Dice{
	int pip_top;
	int pip_front;
	int pip_right;
	int pip_left;
	int pip_back;
	int pip_bottom;
}

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		Dice d1= new Dice();

		d1.pip_top=sc.nextInt();
		d1.pip_front=sc.nextInt();
		d1.pip_right=sc.nextInt();
		d1.pip_left=sc.nextInt();
		d1.pip_back=sc.nextInt();
		d1.pip_bottom=sc.nextInt();

		String s=sc.next();

		for(int i = 0; i < s.length(); i++) {
			if( s.charAt(i)=='S')
				roll_S(d1);
			else if( s.charAt(i)=='N')
				roll_N(d1);
			else if( s.charAt(i)=='E')
				roll_E(d1);
			else 
				roll_W(d1);
		}

		System.out.println(d1.pip_top);

	}

	private static void roll_S(Dice d1) {
		int temp=d1.pip_top;
		d1.pip_top=d1.pip_back;
		d1.pip_back=d1.pip_bottom;
		d1.pip_bottom=d1.pip_front;
		d1.pip_front=temp;
	}

	private static void roll_N(Dice d1) {
		int temp=d1.pip_top;
		d1.pip_top=d1.pip_front;
		d1.pip_front=d1.pip_bottom;
		d1.pip_bottom=d1.pip_back;
		d1.pip_back=temp;
	}

	private static void roll_E(Dice d1) {
		int temp=d1.pip_top;
		d1.pip_top=d1.pip_left;
		d1.pip_left=d1.pip_bottom;
		d1.pip_bottom=d1.pip_right;
		d1.pip_right=temp;
	}

	private static void roll_W(Dice d1) {
		int temp=d1.pip_top;
		d1.pip_top=d1.pip_right;
		d1.pip_right=d1.pip_bottom;
		d1.pip_bottom=d1.pip_left;
		d1.pip_left=temp;
	}


}

