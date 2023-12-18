import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

	    while(sc.hasNext()){

            double tubo = 3.305785;
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            System.out.println(a * b / tubo);
        }
    }
}