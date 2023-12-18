import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int a, b = 0;
			int di = 1;
			a = sc.nextInt();
			b = sc.nextInt();
			a = a+b;
			while(a/10 != 0){
				a /= 10;
				di++;
			}
			System.out.println(di);
		}
	}
}