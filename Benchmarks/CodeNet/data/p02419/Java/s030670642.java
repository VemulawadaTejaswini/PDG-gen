public class Main {
    public static void main(String[] args) {

         java.util.Scanner sc = new java.util.Scanner(System.in);
        String W = sc.next();
        W = W.toUpperCase();

         int count = 0;
        while (true) {
            String T = sc.next();
            T = T.toUpperCase();
            if ("END_OF_TEXT".equals(T)) { break; }
            if (W.equals(T)) { count ++; }
        }
        System.out.println(count);
    }
}