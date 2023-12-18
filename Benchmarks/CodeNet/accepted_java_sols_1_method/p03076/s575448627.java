import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Integer[] menu = {Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next())};

        int result = 0;
        int onesPlace = 10;
        for (int time : menu) {
            result += (int) Math.ceil(time / 10.0) * 10;
            if (time % 10 != 0) {
                onesPlace = Math.min(onesPlace, time % 10);
            }
        }

        System.out.println(result + onesPlace - 10);
    }
}