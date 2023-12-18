import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt();
		int change = 1000 - m;
		int c = 0;
		
		while(change != 0){
			if(change >= 500){
				change -= 500;
				c++;
			}
			else if(change >= 100){
				change -= 100;
				c++;
			}
			else if(change >= 50){
				change -= 50;
				c++;
			}
			else if(change >= 10){
				change -= 10;
				c++;
			}
			else if(change >= 5){
				change -= 5;
				c++;
			}
			else if(change >= 1){
				change -= 1;
				c++;
			}
		}
		
		System.out.println(c);
	}

}