
import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        String w = scan.next();
        w = w.toLowerCase();
        int count = 0;
        while(true){
            String s = scan.next();
            if(s.equals("END_OF_TEXT"))break;
            s = s.toLowerCase();
            if(w.equals(s))count++;
        }
        System.out.println(count);

        scan.close();
    }

}
