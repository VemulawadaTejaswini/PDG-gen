import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long lar = sc.nextInt();
            long sma = sc.nextInt();
            long max = lar, min = sma;
            while (sma != 0) {
                lar = lar % sma;
                long freespace = lar;
                lar = sma;
                sma = freespace;
            }
            System.out.println(lar + " " + (max / lar * min));
        }
    }
}