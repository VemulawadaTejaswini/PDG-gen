import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, a, b, totA = 0, totB = 0;
        String[] elems;
        while((n = Integer.parseInt(sc.nextLine())) > 0) {
            for (int i = 0; i < n; i++) {
                elems = sc.nextLine().split(" ");
                a = Integer.parseInt(elems[0]);
                b = Integer.parseInt(elems[1]);

                if(a > b) {
                    totA += a + b;
                } else if(a < b) {
                    totB += a + b;
                } else {
                    totA += a;
                    totB += b;
                }
            }
            System.out.println(totA + " " + totB);
            totA = 0;
            totB = 0;
        }
    }
}