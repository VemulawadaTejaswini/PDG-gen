import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] str2 = str.split(" ");
        int[] n = new int[str2.length];
        for (int i = 0; i < str2.length; i++) {
            n[i] = Integer.parseInt(str2[i]);
        }
        if(n.length == 2){
            System.out.print(n[0] * n[1] + " ");
            System.out.println((n[0] + n[1]) * 2);

        }
    }
}