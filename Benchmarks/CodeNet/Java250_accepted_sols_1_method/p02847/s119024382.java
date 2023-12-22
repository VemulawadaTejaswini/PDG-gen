import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String dow = sc.next();
        ArrayList<String> week = new ArrayList<>(Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"));
        
        int result = 7 - week.indexOf(dow); 
        System.out.println(result);
    }
}
