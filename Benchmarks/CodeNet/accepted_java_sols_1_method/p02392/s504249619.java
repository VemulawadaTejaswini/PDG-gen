import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int[] numArr = new int[strArr.length];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        if (numArr[0] < numArr[1] && numArr[1] < numArr[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
