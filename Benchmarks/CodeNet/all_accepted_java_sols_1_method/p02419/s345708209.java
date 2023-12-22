import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String W = scan.next();
        int count = 0;

        while (true) {
            String T = scan.next();
//            System.out.println(T);

            if (T.equals("END_OF_TEXT")) {
                break;
            }

            if (T.equalsIgnoreCase(W)) {
                count++;
            }
        }
        System.out.println(count);

    }
}