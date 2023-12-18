import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder str = new StringBuilder();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            //System.out.println(s);
            str.append(s.toUpperCase());
        }
        System.out.println(str);
    }
}