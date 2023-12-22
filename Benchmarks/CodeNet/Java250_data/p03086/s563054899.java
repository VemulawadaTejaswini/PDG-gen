import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int max = 0;
        int currentLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'A':
                case 'C':
                case 'G':
                case 'T':
                    currentLength++;
                    break;
                default:
                    currentLength = 0;
                    break;
            }

            if (max < currentLength) {
                max = currentLength;
            }
        }

        System.out.println(max);
    }
}
