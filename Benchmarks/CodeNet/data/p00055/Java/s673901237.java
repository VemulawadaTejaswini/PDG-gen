import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=0d;
		while(sc.hasNext()) {
			num=Double.parseDouble(sc.next());
			num=num*633/81;
			System.out.println(num);
		}
	}
}
