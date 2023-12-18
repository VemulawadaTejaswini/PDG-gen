import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = sdFormat.parse(S);
        Date date2 = sdFormat.parse("2019/04/30");
        
        String ans = "Heisei";
        if( date2.compareTo(date1) == -1 ) ans = "TBD";
        System.out.println(ans);
        
    }
}
