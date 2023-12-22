import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Double r = inp.nextDouble();

        System.out.printf("%f %f",Math.PI*Math.pow(r, 2), 2*Math.PI*r);
    }

}

