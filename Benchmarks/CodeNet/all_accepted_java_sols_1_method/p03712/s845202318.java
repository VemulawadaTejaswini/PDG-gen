import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int x = scanner.nextInt();
		for(int i=0; i<x+2; i++){
			System.out.printf("#");
		}
		System.out.printf("\n");
		for(int i=0;i<y;i++){
			String l = scanner.next();
			System.out.println("#"+l+"#");
		}
		for(int i=0; i<x+2; i++){
			System.out.print("#");
		}
	}
}