import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        String palabra = Ent.next();
        HashMap tablaHash = new HashMap();
        char arreglo[] =palabra.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            if(!tablaHash.containsKey(arreglo[i])){
                tablaHash.put(arreglo[i], arreglo[i]);
            }
        }
        if(tablaHash.size() == 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
