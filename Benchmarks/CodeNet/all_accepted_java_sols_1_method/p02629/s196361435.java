import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        long n = in.nextLong();

        StringBuilder answer = new StringBuilder();
        while (n > 0) {
            n--;
            answer.append((char) ('a' + n % 26));
            n /= 26;
        }

        System.out.println(answer.reverse());
    }
}
