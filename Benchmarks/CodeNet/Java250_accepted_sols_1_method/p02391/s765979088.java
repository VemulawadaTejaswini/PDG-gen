import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String r = br.readLine();
            String[] in = r.split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            String ans = a == b ? "a == b" : a > b ? "a > b" : "a < b";
            System.out.println(ans);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}