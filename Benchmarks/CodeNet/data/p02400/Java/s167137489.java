import java.util.Scanner;
class Main {
	double r,x = 0.0,y = 0.0;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		x = r * r * 3.141592653589;
		y = 2 * 3.141592653589 * r;
		System.out.printf("%8.6f %8.6f",x,y);
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}