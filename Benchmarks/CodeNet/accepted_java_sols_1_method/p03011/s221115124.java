import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        int a = Ent.nextInt();
        int b = Ent.nextInt();
        int c = Ent.nextInt();
        int suma1 = a + b;
        int suma2 = a + c;
        int suma3 = c + b;
        System.out.println(Math.min(suma1, Math.min(suma2, suma3)));
    }
    
}
