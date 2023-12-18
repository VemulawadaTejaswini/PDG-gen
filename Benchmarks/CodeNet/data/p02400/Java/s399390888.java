import java.util.Scanner;
class Main {
	int r;
	double x = 0.0,y = 0.0;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		x = r * r * 3.141592653589;
		y = 2 * 3.141592653589 * r;
		System.out.printf("%7f %7f",x,y);
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}