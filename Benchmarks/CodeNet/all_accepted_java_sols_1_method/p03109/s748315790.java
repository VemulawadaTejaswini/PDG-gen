import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date baseDate = sdf.parse("2019/05/01");
        Date inDate = sdf.parse(s);
        System.out.println(inDate.before(baseDate) ? "Heisei" : "TBD");
    }
}
