import java.util.*;

public class Main {
    static public void main(String[] args) {
        String word;
        String str;
        int cout = 0;
        
        Scanner sc = new Scanner(System.in);
        word = sc.next();
        while (sc.hasNext()) {
            str = sc.next();
            if (str.equals("END_OF_TEXT")) break;
            if (str.compareToIgnoreCase(word) == 0) cout++;
        }
        System.out.println(cout);
    }
}

