import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String s = scanner.next();

        String r = s;
        if(s.length() > k){
            r = s.substring(0, k);
            r += "...";
        }

        System.out.println(r);
    }
}