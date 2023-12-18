mport java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scan = new Scanner(System.in);
        long N= scan.nextLong();
        double M= scan.nextDouble();
        long MM=(long)M*100;
        long i=N*MM;
        long p=i/100;
System.out.println(p);


    }
}
