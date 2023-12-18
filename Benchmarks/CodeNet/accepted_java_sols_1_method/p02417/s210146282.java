import java.io.*;

public class Main{
    public static void main(String[] args) {
        int[] Ab = new int[26];
        for (int i = 0; i < 26; i++) {
            Ab[i] = 0;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        outer: try {
            while (true) {
                String s = reader.readLine();
                if(s == null)
                {
                    break outer;
                }
                s = s.replace(" ", "");
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.toLowerCase().charAt(i);
                    if (97 > ch || ch > 122) {
                        continue;
                    }
                    Ab[(int) ch - 97] += 1;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 97) + " : " + Ab[i]);
        }
    }
}
