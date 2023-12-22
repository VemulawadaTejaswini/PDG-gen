import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> s = new ArrayList<>();
        for(int i=0; i<n; i++) {
            s.add(sc.nextLine());
        }

        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<String> t = new ArrayList<>();
        for(int j=0; j<m; j++) {
            t.add(sc.nextLine());
        }

        Set<String> setS = new HashSet<>(s);
        Set<String> setT = new HashSet<>(t);

        Map<String,Integer> mapS = new HashMap<>();
        for(String str: setS) {
            mapS.put(str, Collections.frequency(s, str));
        }

        Map<String,Integer> mapT = new HashMap<>();
        for(String str: setT) {
            mapT.put(str, Collections.frequency(t, str));
        }

        int count = 0;
        int currentCount = 0;
        for(String str: setS) {
            if(setT.contains(str)) {
                count = mapS.get(str) - mapT.get(str);
            } else {
                count = mapS.get(str);
            }
            if(currentCount < count) {
                currentCount = count;
            }
        }

        System.out.println(currentCount);
        sc.close();
    }
}
