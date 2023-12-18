import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringTokenizer st;
        int add = 0;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            add = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            int keta = Integer.toString(add).length();
	    System.out.println(keta);
        }
    }
}