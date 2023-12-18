import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        mp.put("AC", 0);
        mp.put("WA", 0);
        mp.put("TLE", 0);
        mp.put("RE", 0);

        while (t>0){

            String in = sc.next();

            mp.put(in, mp.get(in)+1);

            t--;
        }

        for(Map.Entry<String, Integer> entry : mp.entrySet()){
            System.out.println( entry.getKey() + " x " + entry.getValue());
        }
    }
}
