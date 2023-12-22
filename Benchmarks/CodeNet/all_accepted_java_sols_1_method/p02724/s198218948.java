import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        System.out.println( (x/500)*1000+(x%500/5)*5 );
    }
}
