import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y;
		int i;
		x = sc.nextInt();
		y = sc.nextInt();
		if(x == 0 && y == 0){
			System.exit(0);
		}
		if(x < y){
			for(i = 0;;i++){
				System.out.print(x+" ");
				System.out.println(y);
				x = sc.nextInt();
				y = sc.nextInt();
				if(x == 0 && y == 0){
					System.exit(0);
				}
			}
		}else if(x > y){
			for(i = 0;;i++){
				System.out.print(y+ " ");
				System.out.println(x);
				x = sc.nextInt();
				y = sc.nextInt();
				if(x == 0 && y == 0){
					System.exit(0);
				}
			}
		}
	}
}