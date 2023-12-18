import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x,y,a;

		while(true){
			x=sc.nextInt();
			y=sc.nextInt();
			if(x==0 && y==0)
				break;
			if(x>y){
				a=x;
				x=y;
				y=a;
			}
			System.out.println(x+" "+y);
		}
	}

}