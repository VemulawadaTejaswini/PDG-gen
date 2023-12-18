import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		System.out.printf("%f %f\n",x*x*Math.PI,(x*2)*Math.PI);
		sc.close();
	}
}
