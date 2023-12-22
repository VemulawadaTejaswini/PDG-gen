import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        long inu = sc.nextLong();

        StringBuilder sb = new StringBuilder();
        while (inu > 0) {
            inu -= 1;
            long a = inu % 26;
            inu /= 26;
            char c = (char)(a + 'a');
            sb.insert(0, c);
        }

        System.out.println(sb.toString());
    }
}