import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		int result = 8;
		if(x >= 1800){
			result = 1;
		}else if(x >= 1600){
			result = 2;
		}else if(x >= 1400){
			result = 3;
		}else if(x >= 1200){
			result = 4;
		}else if(x >= 1000){
			result = 5;
		}else if(x >= 800){
			result = 6;
		}else if(x >= 600){
			result = 7;
		}
		System.out.println(result);
	}
}
