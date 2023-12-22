import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        if (intArr[0] == intArr[1]) {
            System.out.println("a == b");
        } else if (intArr[0] < intArr[1]) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
}
