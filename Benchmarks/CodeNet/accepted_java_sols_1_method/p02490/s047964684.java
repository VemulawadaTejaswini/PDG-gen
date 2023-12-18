import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		if(x == 0 && y == 0){
			System.exit(0);
		}
		while(x!=0 || y!=0){
		if(x < y){
			System.out.println(x+" "+y);
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0)break;
		}else{
			System.out.println(y+ " "+x);
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0)break;
		}
		}
	}
}