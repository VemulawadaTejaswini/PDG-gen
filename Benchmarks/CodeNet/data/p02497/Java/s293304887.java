import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
				if(m == -1)if(f == -1)if(r == -1)break;
			if(m != -1){if(f != -1){
				if(80 <= m+f            )System.out.println("A");
				if(65 <= m+f && m+f < 80)System.out.println("B");
				if(50 <= m+f && m+f < 65)System.out.println("C");
				if(m+f < 30             )System.out.println("F");
				if(30 <= m+f && m+f < 50){
					if(r >= 50){
						System.out.println("C");
					} else {
						System.out.println("D");
					}
				}
			} else {System.out.println("F");}
			} else {System.out.println("F");}
		}
	}
}