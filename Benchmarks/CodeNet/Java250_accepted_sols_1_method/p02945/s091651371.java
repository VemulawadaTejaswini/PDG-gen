import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tasu = a + b;
        int kakeru = a * b;
        int hiku = a - b;
        if(tasu > hiku) {
            if(tasu > kakeru) {
                System.out.println(tasu);
            }else {
                System.out.println(kakeru);
            }
        }else {
            if(hiku > kakeru) {
                System.out.println(hiku);
            }else {
                System.out.println(kakeru);
            }
        }
    }
}