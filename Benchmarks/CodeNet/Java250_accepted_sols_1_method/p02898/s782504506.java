import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        String[] t = scan.nextLine().split("\\s");
        int people = Integer.parseInt(t[0]);
        int ht = Integer.parseInt(t[1]);
        int count = 0;
        while (scan.hasNextInt()) {
            int memHt = scan.nextInt();
            if (memHt >= ht) {
                count++;
            }
        }
        System.out.println(count);
    }
}