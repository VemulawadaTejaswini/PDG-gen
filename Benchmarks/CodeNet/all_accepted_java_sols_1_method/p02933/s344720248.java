import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int suuzi = yomi.nextInt();
        String mojiretu = yomi.next();
        if (suuzi >= 3200) System.out.println(mojiretu);
        else System.out.println("red");

    }
}
