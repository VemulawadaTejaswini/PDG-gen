import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x,y,sum = 0;

		while(true){
			x = sc.nextLong();
			if(x == 0){
				break;
			}
			for(int j = 1;j <= 10;j++){
				y = x % 10;
				sum = sum + y;
				x = x / 10;
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}