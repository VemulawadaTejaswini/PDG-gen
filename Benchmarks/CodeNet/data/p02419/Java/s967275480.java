public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        String W = sc.next();

        int count = 0;
        String T;
        while (true) {
            T = sc.next();
            if (T.equals("END_OF_TEXT")) { break; }
            System.out.println(T);
            if (T.equalsIgnoreCase(W)) { count ++; }
        }
        System.out.println(count);
    }
}