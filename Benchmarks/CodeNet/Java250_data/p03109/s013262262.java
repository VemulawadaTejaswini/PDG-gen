import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st2 = st.replace("/", "");
        int a = Integer.parseInt(st2);
        if (a <= 20190430) System.out.println("Heisei");
        else System.out.println("TBD");
    }
}