import java.util.Scanner;


class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int tate = sc.nextInt();
			int yoko = sc.nextInt();
		System.out.println(tate * yoko + " " + (2 * (tate + yoko)));
	}
}