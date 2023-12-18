import java.util.Scanner;

class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextLong();

		System.out.printf("%f %f",Math.pow(r,2) * Math.PI, 2 * r * Math.PI);
	}
}