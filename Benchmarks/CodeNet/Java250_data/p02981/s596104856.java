import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        int hito = yomi.nextInt();
        int densyatin = yomi.nextInt();
        int taxiuntin = yomi.nextInt();
        if (hito * densyatin > taxiuntin) System.out.println(taxiuntin);
        else System.out.println(hito * densyatin);

    }
}
