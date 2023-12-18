import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        execute(br);
    }
    private static void execute(BufferedReader br) throws Exception {
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] strs = br.readLine().split(" ");
            int a = Integer.parseInt(strs[1]), b = Integer.parseInt(strs[2]);
            if (a == 0) { a = 1; }
            if (b == 0) { continue; }
            switch (strs[0]) {
                case "replace":
                    str = replace(str, a, b, strs[3]);
                    break;
                case "reverse":
                    str = reverse(str, --a, --b);
                    break;
                case "print":
                    print(str, a, b);
                    break;
            }
            System.out.println(i + ":" + str);
        }
    }

    private static void print(String str, int start, int end) {
        System.out.println(str.substring(--start, end));
    }

    private static String reverse(String str, int a, int b) {
        char[] chars = str.toCharArray();
        int n = (int) Math.ceil((b - a) / 2);
        for (int i = 0; i < n; i++) {
            char wk = chars[a + i];
            chars[a + i] = chars[b - i];
            chars[b - i] = wk;
        }
        return new String(chars);
    }

    private static String replace(String str, int a, int b, String replacement) {
        int c = b - a + 1;
        return str.replaceAll("(?<=^.{"+ a +"}).{" + c + "}", replacement);
    }
}