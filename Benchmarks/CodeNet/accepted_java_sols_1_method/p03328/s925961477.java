import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b - a - 1;
		int x = 1;
		int anc = 0;
		for(int i = 0;i<c;i++) {
			anc = anc + x;
			x++;
		}
		System.out.print(anc - a);;
	}
}