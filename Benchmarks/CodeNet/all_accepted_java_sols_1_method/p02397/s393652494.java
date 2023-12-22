import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int y = 0;
		int tmp = 0;
		for(int i = 1; true ;i++){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0)break;
			if(x > y){
				tmp = x;
				x = y;
				y = tmp;
			}
			System.out.println(x + " " + y);
		}
	}
}
