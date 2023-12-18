import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        s = s.replaceAll("W+", "W");
        s = s.replaceAll("B+", "B");
        System.out.println(s.length() - 1);
    }
}