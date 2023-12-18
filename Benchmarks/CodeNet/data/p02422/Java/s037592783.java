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
            switch (strs[0]) {
                case "replace":
                    str = replace(str, Integer.parseInt(strs[1]), Integer.parseInt(strs[2]), strs[3]);
                    break;
                case "reverse":
                    str = reverse(str, Integer.parseInt(strs[1]), Integer.parseInt(strs[2]));
                    break;
                case "print":
                    print(str, Integer.parseInt(strs[1]), Integer.parseInt(strs[2]));
                    break;
            }   
        }   
    }   

    private static void print(String str, int start, int end) {
        System.out.println(str.substring(start, ++end));
    }   

    private static String reverse(String str, int a, int b) {
        char[] chars = str.toCharArray();
        int n = b - a - 1;
        for (int i = 0; i < n; i++) {
            char wk = chars[a + i]; 
            chars[a + i] = chars[b - i]; 
            chars[b - i] = wk; 
        }   
        return new String(chars);
    }   

    private static String replace(String str, int a, int b, String replacement) {
        return str.replaceAll("(?<=^.{"+a+"}).{"+b+"}", replacement);
    }   
}