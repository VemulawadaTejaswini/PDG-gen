import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String line2 = br.readLine();

        String[] array = line1.split(" ");

        int n = Integer.parseInt(array[0]);
        int x = Integer.parseInt(array[1]);

        array = line2.split(" ");
        int l[]  = new int[n];

        for(int i = 0;i < n;i++){
            l[i] = Integer.parseInt(array[i]);
        }

        int kaisuu = 1;
        int length = 0;
        for(int i = 0;i < n;i++){
            length = length + l[i];
            if(length > x ){
                break;
            }
            kaisuu++;
        }
        System.out.println(kaisuu);
    }
}