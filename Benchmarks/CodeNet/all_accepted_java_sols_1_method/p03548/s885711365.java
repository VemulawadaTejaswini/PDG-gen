import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ln=sc.nextInt();
		int futo=sc.nextInt();
		int kan=sc.nextInt();

		System.out.println((ln-kan)/(futo+kan));
	}
}