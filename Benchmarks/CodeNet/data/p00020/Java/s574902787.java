import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder str = new StringBuilder();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            str.append(s.toUpperCase());
            str.append("\n");
        }
        System.out.print(str);
    }
}