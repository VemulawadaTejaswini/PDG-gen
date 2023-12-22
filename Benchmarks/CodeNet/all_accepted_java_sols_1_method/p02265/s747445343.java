import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        Deque<Integer> numero = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] opcion;
        int n = Integer.parseInt(br.readLine());
        for (int t = 0; t < n; t++) {
            opcion = br.readLine().split(" ");
            switch (opcion[0]) {
                case "insert":
                    numero.addFirst(Integer.parseInt(opcion[1]));
                    break;
                case "delete":
                    numero.remove(Integer.parseInt(opcion[1]));
                    break;
                case "deleteFirst":
                    numero.removeFirst();
                    break;
                default:
                    numero.removeLast();
            }
        }
        if (numero.size() == 1) {
            System.out.println(numero.getFirst());
        } else {
            StringBuilder resul = new StringBuilder();
            int longitud = numero.size() - 1;
            for (int i = 0; i < longitud; i++) {
                resul.append(numero.getFirst()).append(" ");
                numero.removeFirst();
            }
            resul.append(numero.getFirst());
            System.out.println(resul.toString());
        }
    }
}

