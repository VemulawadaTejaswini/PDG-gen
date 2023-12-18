import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x == 0 && y == 0){
				break;
			}
			if(x < y){
				int t = x;
				x = y;
				y = t;
			}
			int r = x % y;
			int count = 1;
			while(r != 0){
				x = y;
				y = r;
				r = x % y;
				count++;
			}
			System.out.println(y + " " + count);
		}
	}
}