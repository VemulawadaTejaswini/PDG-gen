import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String input;
            input = r.readLine();
            System.out.println(swap(input));
        } catch (Exception e) {}
    }

    public static String swap(String s) {
        String tmp_s;
        tmp_s = s.replaceAll("apple", "xxxxxxxxxxx");
        tmp_s = tmp_s.replaceAll("peach", "apple");
        tmp_s = tmp_s.replaceAll("xxxxxxxxxxx", "peach");
        return tmp_s;
    }
}