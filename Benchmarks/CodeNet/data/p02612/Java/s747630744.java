import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<=1000) {
			System.out.println(1000-N);
		}
		if(1000< N && N<=2000) {
			System.out.println(2000-N);
		}
		if(N>2000 && N<=3000) {
			System.out.println(3000-N);
		}
		if(N>3000 && N<=4000) {
			System.out.println(4000-N);
		}
		if(N>4000 && N<=5000) {
			System.out.println(5000-N);
		}
		if(N>5000 && N<=6000) {
			System.out.println(6000-N);
		}
		if(N>6000 && N<=7000) {
			System.out.println(7000-N);
		}
		if(N>7000 && N<=8000) {
			System.out.println(8000-N);
		}
		if(N>8000 && N<=9000) {
			System.out.println(9000-N);
		}
		if(N>9000 && N<=10000) {
			System.out.println(10000-N);
		}

	}
}