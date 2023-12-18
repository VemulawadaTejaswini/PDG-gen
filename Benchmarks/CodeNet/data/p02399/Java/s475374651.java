import java.util.Scanner;
class Main {
	int a,b,x,y;
	double z = 0.0;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		x = a / b;
		y = a % b;
		z = a * 1.0 / b;
		System.out.printf("%d %d %7f\n",x,y,z);
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}