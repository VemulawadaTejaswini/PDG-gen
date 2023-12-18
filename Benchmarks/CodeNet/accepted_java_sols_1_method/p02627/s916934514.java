import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        char c = sc.next().toCharArray()[0];
        if('a'<=c && c<='z') {
            System.out.println('a');
        } else {
            System.out.println('A');
        }

    }

}