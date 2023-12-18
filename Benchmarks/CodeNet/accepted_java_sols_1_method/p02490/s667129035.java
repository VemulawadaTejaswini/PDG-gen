import java.util.Scanner;

 class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		for(;;){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int temp;
			if(x==0 && y==0)break;
			if(x>y){
				temp=x;
				x=y;
				y=temp;
			}
			System.out.println(x+" "+y);
		}
	}
 }