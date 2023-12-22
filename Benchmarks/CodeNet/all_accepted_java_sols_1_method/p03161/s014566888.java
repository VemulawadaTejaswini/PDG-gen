import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int n, k;
        BufferedReader br =
                new BufferedReader (new InputStreamReader (System.in));
        String[] line1 = br.readLine().split(" ");
        n = Integer.parseInt(line1[0]);
        k = Integer.parseInt(line1[1]);
        int[] h = new int[n];
        String[] line2 = br.readLine().split(" ");
        for(int i = 0; i < line2.length; i++){
            h[i] = Integer.parseInt(line2[i]);
        }
        int[] result = new int[n];
        result[0] = 0;
        for(int i = 1; i < n; i++){
            int min = result[i - 1] + Math.abs(h[i] - h[i - 1]);
            if(i >= 2){
                for(int j = Math.max(0, i - k); j < i; j++) {
                    int temp = result[j] + Math.abs(h[i] - h[j]);
                    if(min > temp){
                        min = temp;
                    }
                }
            }
            result[i] = min;
        }
        System.out.println(result[n - 1]);
    }


}
