import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.next();
        }

        int ac = Arrays.stream(a)
            .filter(s -> s.equals("AC")).toArray().length;

        int wa = Arrays.stream(a)
            .filter(s -> s.equals("WA")).toArray().length;

        int tle = Arrays.stream(a)
            .filter(s -> s.equals("TLE")).toArray().length;

        int re = Arrays.stream(a)
            .filter(s -> s.equals("RE")).toArray().length;

        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
    }
}