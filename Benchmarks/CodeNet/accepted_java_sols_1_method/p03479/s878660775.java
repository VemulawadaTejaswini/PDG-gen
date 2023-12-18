import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		long moto=sc.nextLong();
		long max=sc.nextLong();

		long wari=max/moto;
		long base=1;
		long suu=1;

		while(true) {
			if(wari<2) {
				break;
			}
			else {
				wari=wari/2;
				suu++;
			}
		}
		System.out.println(suu);
	}
}