import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Integer r = Integer.parseInt(sc.next());
        Integer r2 =  r * r * 314;
        Integer result = r2 / 314;
        System.out.println(result);
    }
}