import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 提出用Mainクラス
 */
public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        int result;
        String readLine = br.readLine();
        N = Integer.parseInt(readLine);
        result = N * N * N;
        System.out.println(result);
    }
}