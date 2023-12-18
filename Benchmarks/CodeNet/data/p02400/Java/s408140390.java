import java.util.Scanner;

public class Main {
    public static void main(String args[]){
	double PI = 3.14159265358979;
	Scanner in= new Scanner(System.in);
	int r = in.nextInt();
	double s = PI * r * r;
	double len = 2 * PI *r;

	System.out.printf("%f %f", s, len);
    }   
}