import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.printf("%f %f%n",Math.PI*r*r,Math.PI*r*2);
	}
}
