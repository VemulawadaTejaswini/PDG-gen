import java.util.Scanner;


public class Circle {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	sc.close();
	System.out.printf("%f %f", r*r* Math.PI, 2*r* Math.PI );
}
}