
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean yymm = false;
        boolean mmyy = false;
        String ab = s.substring(0, 2);
        String cd = s.substring(2);
        Set<String> month = new HashSet<>();
        month.add("01");
        month.add("02");
        month.add("03");
        month.add("04");
        month.add("05");
        month.add("06");
        month.add("07");
        month.add("08");
        month.add("09");
        month.add("10");
        month.add("11");
        month.add("12");
        if (month.contains(ab)) {
            mmyy = true;
        }
        if (month.contains(cd)) {
            yymm = true;
        }
        if (mmyy == true && yymm == true) {
            System.out.println("AMBIGUOUS");
        } else if (mmyy == true) {
            System.out.println("MMYY");
        } else if (yymm == true) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }



    }
}
