
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        int casos = Ent.nextInt();
        float total = 0;
        for (int i = 0; i < casos; i++) {
            float aux = Ent.nextInt();
            float numero = 1 / aux;
            total += numero;
        }
        System.out.println(1/total);
    }
}