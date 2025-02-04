
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String cards = br.readLine();
            if(cards != null) {
                String[] ab = cards.split(" ");
                if("1".equals(ab[0])) {
                    ab[0] = "100";
                }
                if("1".equals(ab[1])) {
                    ab[1] = "100";
                }
                
                int a = Integer.parseInt(ab[0]);
                int b = Integer.parseInt(ab[1]);
                if(a == b) {
                    System.out.println("Draw");
                } else if(a < b) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                }
            }
        } catch (IOException ex) {
            System.out.println("wrong input");
        }
    }
}
