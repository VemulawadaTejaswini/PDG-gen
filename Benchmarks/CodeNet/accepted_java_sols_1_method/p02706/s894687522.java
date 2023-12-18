import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        String[] inp = s.split(" ");

        int n = Integer.parseInt(inp[0]);
        int m = Integer.parseInt(inp[1]);

        int[] arr = new int[m];
        String s1 = reader.readLine();
        String[] inp1 = s1.split(" ");

        long sum=0;
        for (int i = 0; i <inp1.length ; i++) {
            arr[i]=Integer.parseInt(inp1[i]);
            sum+=arr[i];
        }

        if(n-sum>=0)
            System.out.println(n-sum);
        else
            System.out.println(-1);
    }
}
