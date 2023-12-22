import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = 0;
        int z = 0;
        
        while (s.charAt(a) != 'A') {
            a++;
        }
        for (int i = a + 1; i < s.length(); i++) {
            if (s.charAt(i) == 'Z') {
                z = i;
            }
        }
        System.out.println(z-a+1);
    }
}
