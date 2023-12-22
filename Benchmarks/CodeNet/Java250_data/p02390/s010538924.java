import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
        int S;
        int h, m, s;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = Integer.parseInt(br.readLine());

        h = S / (60 * 60);
        S = S % (60 * 60);
        m = S / 60;
        s = S % 60;
        System.out.println(h + ":" + m + ":" + s);

    }

}