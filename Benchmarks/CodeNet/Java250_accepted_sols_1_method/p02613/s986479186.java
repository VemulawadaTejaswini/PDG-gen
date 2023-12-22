import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> s = new HashMap<>();
        for(int i=0; i<n; i++) {
            String tmp = sc.next();
            if(s.containsKey(tmp)) {
                s.put(tmp, s.get(tmp)+1);
            } else {
                s.put(tmp, 1);
            }
        }

        String[] rst = {"AC", "WA", "TLE", "RE"};
        boolean isAC = false;
        boolean isWA = false;
        boolean isTLE = false;
        boolean isRE = false;
        for(String tmp2: s.keySet()) {
            if(tmp2.equals(rst[0])) isAC = true;
            else if(tmp2.equals(rst[1])) isWA = true;
            else if(tmp2.equals(rst[2])) isTLE = true;
            else if(tmp2.equals(rst[3])) isRE = true;
        }

        if(isAC) {
            System.out.println("AC" + " x " + s.get("AC"));
        } else {
            System.out.println("AC" + " x " + "0");
        }

        if(isWA) {
            System.out.println("WA" + " x " + s.get("WA"));
        } else {
            System.out.println("WA" + " x " + "0");
        }

        if(isTLE) {
            System.out.println("TLE" + " x " + s.get("TLE"));
        } else {
            System.out.println("TLE" + " x " + "0");
        }

        if(isRE) {
            System.out.println("RE" + " x " + s.get("RE"));
        } else {
            System.out.println("RE" + " x " + "0");
        }
    }
}
