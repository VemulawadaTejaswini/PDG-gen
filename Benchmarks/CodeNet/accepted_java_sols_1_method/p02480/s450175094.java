import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		num = (int)Math.pow(num,3);
		System.out.println(num);
		scan.close();
	}
}