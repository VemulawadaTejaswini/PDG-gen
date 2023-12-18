import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp = sc.nextLine();

        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date a = df.parse(temp);

            if (a.compareTo(df.parse("2019/04/30")) <= 0) {
                System.out.println("Heisei");
            } else {
                System.out.println("TBD");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
