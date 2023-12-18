import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        String[] inp = s.split(" ");

        int[] arr = new int[n-1];

        for (int i = 0; i < inp.length; i++) {
            arr[i]=Integer.parseInt(inp[i]);
        }

        int[] countarr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            //System.out.print(i+" ");
            int val = arr[i]-1  ;
            //System.out.println(val);
            countarr[val]++;
        }

        for (int i = 0; i <countarr.length ; i++) {
            System.out.println(countarr[i]);
        }

    }
}
