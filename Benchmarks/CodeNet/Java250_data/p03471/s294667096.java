import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// input
		int num = scan.nextInt();
		int otoshidama = scan.nextInt();
		
		// search
		boolean flag = false;
		loop: for(int i = 0; i <= num; i++){
			for(int j = 0; j <= num - i; j++){
				if(10000 * i + 5000 * j + 1000 * (num - i - j) == otoshidama){
					System.out.println(i + " " + j + " " + (num - i - j));
					flag = true;
					break loop;
				}
			}
		}
		
		// answer
		if(!flag){
			System.out.println("-1 -1 -1");
		}
	}
}