import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scan = new Scanner(System.in);
        double N= scan.nextDouble();
        double M= scan.nextDouble();
        long MA=(long)M;
        double A=M-(double)MA;
        long LL= (long) ((long)N*A);
        long PP= (long) ((long)N*MA);

        long p=PP+LL;
System.out.println(p);


    }
}
