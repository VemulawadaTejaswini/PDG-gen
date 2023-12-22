import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        double r = stdIn.nextDouble();

        System.out.printf("%.6f",r*r*Math.PI);
        System.out.print(" ");
        System.out.printf("%.6f",2*r*Math.PI);
        System.out.println();

        stdIn.close();
    }
}

