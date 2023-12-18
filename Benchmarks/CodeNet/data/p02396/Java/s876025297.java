import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        String str;
        int x;
        
        while (true) {
            str = br.readLine();
            x = Integer.parseInt(str);
            if (x == 0) {
                break; 
            }
            System.out.printf("Case %d: %d", ++i, x);
            }
    }
}

