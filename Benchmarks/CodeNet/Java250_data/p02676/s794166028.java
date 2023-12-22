import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        String s = input.next();
        if (k < s.length()){
            s = s.substring(0,k) + "...";
            System.out.println(s);
        } else {
            System.out.println(s);
        }
    }
}