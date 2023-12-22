import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

//        Character change = s.charAt(k-1);
        String change = s.substring(k-1, k);
        change = change.toLowerCase();


        String before = s.substring(0, k-1);
        String after = s.substring(k);


        System.out.print(before + change + after);

    }
}


