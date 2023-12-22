import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a == 0 && b == 0){
				break;
			}
			int s = b - a;
			if(s == 0){
				System.out.println("0 0 0");
				continue;
			}
			int x = 0;
			int y = 0;
			int z = 0;
			if(s >= 1000){
				x = s / 1000;
				s %= 1000;
			}
			if(s >= 500){
				y = s / 500;
				s %= 500;
			}
			if(s >= 100){
				z = s / 100;
				s %= 100;
			}
			System.out.println(z + " " + y + " " + x);
		}
	}
}