import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = new StringBuffer(sc.nextLine()).reverse().toString();

        int i = Character.getNumericValue(s.charAt(0));
        if (i == 3) {
            System.out.println("bon");
        } else if (i ==0 || i == 1 || i == 6|| i == 8) {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }
    }
}