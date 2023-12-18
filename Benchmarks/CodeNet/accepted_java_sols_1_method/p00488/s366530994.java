import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pasta[] = new int[3];
		int juice[] = new int[2];
		int minPasta, minJuice;
		for (int i = 0; i < 3; i++) {
			pasta[i] = sc.nextInt();
		}
		for (int i = 0; i < 2; i++){
			juice[i] = sc.nextInt();
		}
		
		minPasta = Math.min(Math.min(pasta[0], pasta[1]), pasta[2]);
		minJuice = Math.min(juice[0], juice[1]);
		
		System.out.printf("%d\n", minPasta + minJuice - 50);

	}
}