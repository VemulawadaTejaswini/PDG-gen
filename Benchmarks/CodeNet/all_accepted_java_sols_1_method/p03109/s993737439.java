import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] dates = s.split("/");
        if (Integer.parseInt(dates[0]) < 2019) {
            System.out.println("Heisei");
        } else if (Integer.parseInt(dates[0]) > 2019){
            System.out.println("TBD");
        } else {
            if (Integer.parseInt(dates[1]) < 4) {
                System.out.println("Heisei");
            } else if (Integer.parseInt(dates[1]) > 4){
                System.out.println("TBD");
            } else {
                if (Integer.parseInt(dates[2]) > 30) {
                    System.out.println("TBD");
                } else {
                    System.out.println("Heisei");
                }
            }
        }
    }
}