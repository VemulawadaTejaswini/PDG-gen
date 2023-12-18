import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        short tipos = entrada.nextShort();
        short eleccion = entrada.nextShort();
        ArrayList<Short> listaPrecios = new ArrayList<Short>();
        for (int i = 0; i < tipos; i++) {
            short valor = entrada.nextShort();
            listaPrecios.add(valor);
        }
        short sumaMin = 0;
        for (int i = 0; i < eleccion; i++) {
            short min = Collections.min(listaPrecios);
            sumaMin += min;
            int index = listaPrecios.indexOf(min);
            listaPrecios.remove(index);
        }
        System.out.println(sumaMin);
    }
}