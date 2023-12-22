import java.util.Scanner;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        long a = ler.nextLong(), b = ler.nextLong(), c = ler.nextLong(), d = ler.nextLong();
        Vector<Long> v = new Vector<>();

        v.add(a*c);
        v.add(a*d);
        v.add(b*c);
        v.add(b*d);
        v.sort(null);

        System.out.println(v.lastElement());
    }   
}
