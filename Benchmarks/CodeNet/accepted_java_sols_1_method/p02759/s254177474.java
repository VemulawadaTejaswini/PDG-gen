import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int page = n / 2;
		
		if(n % 2 > 0){
			page++;
		}
		
		System.out.println(page);
	}
}