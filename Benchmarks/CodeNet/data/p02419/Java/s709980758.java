import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        String target = sc.next().toLowerCase();
        while(true) {
            String tmp = sc.next();
            if(tmp.equals("END_OF_TEXT")) {
                break;
            }
            str.add(tmp.toLowerCase());
        }
        sc.close();

        System.out.println(Collections.frequency(str, target));
    }
}

