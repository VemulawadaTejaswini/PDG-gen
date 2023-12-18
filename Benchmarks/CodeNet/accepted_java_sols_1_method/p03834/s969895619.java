import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            str = str.replace(',',' ');
            System.out.println(str);
        }
    }
}