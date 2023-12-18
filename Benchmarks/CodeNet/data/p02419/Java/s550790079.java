import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count = 0;
        while(true) {
            String str = sc.next();
            if(str.equals("END_OF_TEXT")) break;
            str = str.toLowerCase();
            if(str.equals(word)) count++;
        }

        System.out.println(count);
    }
}
