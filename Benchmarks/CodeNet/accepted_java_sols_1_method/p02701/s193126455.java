import java.util.Scanner;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> prize = new HashSet<String>();
        int times = scanner.nextInt();

        for(int i = 0; i < times; i++) {
            String str = scanner.next();
            prize.add(str);
        }

    System.out.println(prize.size());
    }
}