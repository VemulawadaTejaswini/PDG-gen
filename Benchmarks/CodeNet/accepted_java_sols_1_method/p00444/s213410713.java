import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = 1000 - a;
			int c = 0;
			if(a == 0) break;
			while(b >= 500){
				b -= 500;
				c++;
			}
			while(b >= 100){
				b -= 100;
				c++;
			}
			while(b >= 50){
				b -= 50;
				c++;
			}
			while(b >= 10){
				b -= 10;
				c++;
			}
			while(b >= 5){
				b -= 5;
				c++;
			}
			while(b >= 1){
				b--;
				c++;
			}
			if(b == 0) System.out.println(c);
		}
	}
}