import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p = br.readLine();

        String ss = s + s;

        if (contain(ss, p)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private static boolean contain(String ss, String p) {
        for (int i = 0; i < ss.length(); ) {
            for (int j = 0; j < p.length(); j++) {
                if (ss.charAt(i) == p.charAt(j)) {
                    if (j == p.length() - 1) {
                        return true;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                    break;
                }
            }
        }
        
        return false;
    }
}