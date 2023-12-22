import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            String ary = br.readLine();
            String[] ar = ary.split(" ");
            System.out.print(ar[num-1]);
            for (int i=num-1; i>0; i--) {
                System.out.print(" " + ar[i-1]);
            }
            System.out.println("");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}