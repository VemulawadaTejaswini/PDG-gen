import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        for (int i = st.length()-2; i > 0; i -= 2) {
            if (st.substring(0, i/2).equals(st.substring(i/2, i))) {
                System.out.print(i);
                break;
            }
        }
    }
}