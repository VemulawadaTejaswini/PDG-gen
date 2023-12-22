import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 提出用Mainクラス
 */
public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] result = new Integer[2];
        Integer[] N = new Integer[2];
        String[] input = new String[2];
        String readLine = br.readLine();
        input = readLine.split(" ");
        N[0] = Integer.parseInt(input[0]);
        N[1] = Integer.parseInt(input[1]);
        result[0] = N[0] * N[1];
        result[1] = N[0] + N[0] + N[1] + N[1];
        System.out.println(result[0] +" " + result[1]);
    }
}