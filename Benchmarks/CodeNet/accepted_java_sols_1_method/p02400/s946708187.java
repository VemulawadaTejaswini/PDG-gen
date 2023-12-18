import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double n = cin.nextDouble();
        System.out.printf("%f %f\n", n*n*Math.PI, 2*n*Math.PI);
    }
}

