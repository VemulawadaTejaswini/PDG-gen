import java.util.Scanner;
import java.math.BigDecimal;

class Main {
    public static final double pi = Math.PI;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        System.out.println( new BigDecimal(pi * Math.pow(r,2))  + " " + new BigDecimal(2*r*pi) );
        scanner.close();
    }
}

