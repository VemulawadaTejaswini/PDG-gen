import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        sc.close();

        int date = Integer.parseInt(str.replace("/", ""));

        //        Date in = DateFormat.getDateInstance().parse(str);
        //        Date date = DateFormat.getDateInstance().parse("2019/04/30");

        if (date <= 20190430) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
