import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String str = stdR.readLine();
        int w = Integer.parseInt(stdR.readLine());
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(index < str.length()) {
            sb.append(str.charAt(index));
            index += w;
        }
        System.out.println(sb.toString());
    }
}