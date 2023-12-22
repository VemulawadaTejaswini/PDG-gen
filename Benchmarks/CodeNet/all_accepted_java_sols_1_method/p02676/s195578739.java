import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        if(k < s.length()){
            s = s.substring(0, k);
            s = s + "...";
        }
        System.out.println(s);
        sc.close();

    }

}
