import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tipos = entrada.nextInt();
        int eleccion = entrada.nextInt();
        ArrayList<Integer> listaPrecios = new ArrayList<Integer>();
        for (int i = 0; i < tipos; i++) {
            int valor = entrada.nextInt();
            listaPrecios.add(valor);
        }
        int sumaMin = 0;
        for (int i = 0; i < eleccion; i++) {
            int min = Collections.min(listaPrecios);
            sumaMin += min;
            int index = listaPrecios.indexOf(min);
            listaPrecios.remove(index);
        }
        System.out.println(sumaMin);
    }
}