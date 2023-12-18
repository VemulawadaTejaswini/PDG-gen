import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, d;
		int sum = 0;
		while(true){
			x = sc.nextInt();
			if(x == 0)
				break;
			else 
				d = (int)Math.log10((double)x) + 1;
				if(d > 1000){
					System.out.println("Error");
					break;
				}
				else
					for(int i = 0; i < d; i++){
						sum += x % 10;
						x /= 10;
					}
				System.out.println(sum);
		}
	}
}