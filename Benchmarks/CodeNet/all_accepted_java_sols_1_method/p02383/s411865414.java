
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int d1, d2, d3, d4, d5, d6;
        d1 = scn.nextInt();
        d2 = scn.nextInt();
        d3 = scn.nextInt();
        d4 = scn.nextInt();
        d5 = scn.nextInt();
        d6 = scn.nextInt();

        String order = scn.next();
        for (int i = 0; i < order.length(); i++) {
            String or = String.valueOf(order.charAt(i));
            int temp = d1;
            switch (or) {
                case "W":
                    d1 = d3;
                    d3 = d6;
                    d6 = d4;
                    d4 = temp;
                    break;
                case "E":
                    d1 = d4;
                    d4 = d6;
                    d6 = d3;
                    d3 = temp;
                    break;
                case "S":
                    d1 = d5;
                    d5 = d6;
                    d6 = d2;
                    d2 = temp;
                    break;
                default:
                    d1 = d2;
                    d2 = d6;
                    d6 = d5;
                    d5 = temp;

            }
        }

        System.out.println(d1);

        scn.close();

    }

}
