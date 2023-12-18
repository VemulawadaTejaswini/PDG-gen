import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            char c;
            String line;
            line = br.readLine();
            for (int i = 0; i < line.length(); i++) {
                c = line.charAt(i);
                if(Character.isLowerCase(c)){
                    c = Character.toUpperCase(c);
                }
                sb.append(c);
            }
            System.out.println(sb.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}