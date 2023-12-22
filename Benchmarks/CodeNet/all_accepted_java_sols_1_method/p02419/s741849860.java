
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String W = sc.next();
        int count = 0;
        while (sc.hasNext()){
            String T = sc.next();
            T = T.toLowerCase();
            if (T.equals("END_OF_TEXT"))
                break;
            if (T.equals(W))
                count++;
        }
        System.out.println(count);
    }
}

