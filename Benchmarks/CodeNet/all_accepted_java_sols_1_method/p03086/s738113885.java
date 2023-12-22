import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tmp = scan.next() + "d";
        int tmpCount = 0, count = 0;
        String ACGTString[] = tmp.split("");
        for (String nuc : ACGTString) {
            if (nuc.equals("A") || nuc.equals("G") || nuc.equals("C") || nuc.equals("T")) {
                tmpCount += 1;
            } else {
                if (count < tmpCount) {
                    count = tmpCount;
                }
                tmpCount = 0;
            }
        }
        System.out.println(count);

    }
}
