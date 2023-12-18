import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Map<String, Integer> map = new HashMap<>();
        map.put("SUN",7);
        map.put("MON",6);
        map.put("TUE",5);
        map.put("WED",4);
        map.put("THU",3);
        map.put("FRI",2);
        map.put("SAT",1);
        System.out.println(map.get(s));
    }
}
