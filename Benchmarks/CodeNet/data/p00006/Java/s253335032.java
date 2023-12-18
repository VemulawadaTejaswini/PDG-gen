import java.util.*;

class Main {
    final private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    final private static StringBuilder sb = new StringBuilder();

    public static void main(final String[] args) {
        final String line = in.nextLine();
        
        for (int i = line.length() - 1;  0 <= i; --i) {
            sb.append(line.charAt(i));
        }
        System.out.println(sb);
    }
}