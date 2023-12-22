import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int health = sc.nextInt();
		int attack = sc.nextInt();
		sc.close();
		if(health%attack == 0) {
			System.out.println(health/attack);
		}else {
		System.out.println(health/attack+1);
		}
	}
	}


