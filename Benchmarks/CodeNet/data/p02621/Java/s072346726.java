import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        short numero=entrada.nextShort();
        double calculo= numero+Math.pow(numero,2)+Math.pow(numero,3);
        System.out.println((short)calculo);

    }
}