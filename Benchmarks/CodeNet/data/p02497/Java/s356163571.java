import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		while(true){
		Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
		if(m == -1 && f == -1 && r == -1){
				break;
			}
		if(m == -1 || f == -1){
			System.out.println("F");
		}
		if(m + f >= 80){
			System.out.println("A");
		}
		if(m + r < 80 && m + r >= 65){
			System.out.println("B");
		}
		if(m + r < 65 && m + r >= 50){
			System.out.println("C");
		}
		if(m + r < 50 && m + r >= 30 && f >= 50){
			System.out.println("C");
		}
    	if(m + r < 50 && m + r >= 30 && f < 50){
			System.out.println("D");
		}
		if(m + r < 30){
			System.out.println("F");
		}
		}
	}
}