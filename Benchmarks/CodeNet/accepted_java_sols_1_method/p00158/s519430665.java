import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			long n = stdIn.nextLong();
			if(n == 0){
				break;
			}
			int count = 0;
			while(n != 1){
				if(n % 2 == 0){
					n = n / 2;
				}else if(n % 2 == 1){
					n = n * 3 + 1;
				}
				count++;
			}
			System.out.println(count);
		}
	}
}