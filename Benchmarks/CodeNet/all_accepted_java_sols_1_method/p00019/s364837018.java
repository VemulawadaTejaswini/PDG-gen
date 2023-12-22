import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        long out = 1;
        for(int i = 1 ; i <= in ; i++)
            out *= i;
        System.out.println(out);
    }
}