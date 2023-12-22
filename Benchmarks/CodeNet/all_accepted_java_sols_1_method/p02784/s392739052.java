
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextLong();
        long N = scanner.nextLong();
        long total = 0;
        for (int i=0;i<N;i++)
        {
            total+=scanner.nextLong();
        }
        System.out.println(total<H?"No":"Yes");
    }
}