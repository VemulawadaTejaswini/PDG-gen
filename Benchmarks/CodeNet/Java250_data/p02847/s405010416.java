import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap week = new HashMap<String, Integer>();
        week.put("SUN", 7);
        week.put("MON", 6);
        week.put("TUE", 5);
        week.put("WED", 4);
        week.put("THU", 3);
        week.put("FRI", 2);
        week.put("SAT", 1);
        System.out.println(week.get(s));
    }
}
