import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
		int p = sc.nextInt();
		if(a >=0 && p >= 0 && a <=100 && p <= 100) {
			System.out.println(((a*3)+p)/2);
			}
		
		}
	}