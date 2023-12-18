import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        // Map: sに含まれる文字 -> 位置のSet
        Map<Character, Set<Integer>> mapS = new HashMap<>();
        // Map: tに含まれる文字 -> 位置のSet
        Map<Character, Set<Integer>> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!mapS.keySet().contains(s.charAt(i))) {
                mapS.put(s.charAt(i), new TreeSet<>());
            }
            if (!mapT.keySet().contains(t.charAt(i))) {
                mapT.put(t.charAt(i), new TreeSet<>());
            }
            mapS.get(s.charAt(i)).add(i);
            mapT.get(t.charAt(i)).add(i);
        }

        // mapSとmapTのvalueに含まれるSetがすべて等しければYes
        // でなければNoとなる
        boolean isOk = true;
        for (Set<Integer> setS : mapS.values()) {
            Integer i = setS.iterator().next();
            for (Set<Integer> setT : mapT.values()) {
                if (setT.contains(i)) {
                    if (!setS.equals(setT)) {
                        isOk = false;
                        break;
                    }
                }
            }
            if (!isOk) {
                break;
            }
        }

        if (isOk) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
