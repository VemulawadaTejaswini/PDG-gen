
import java.io.*;
import java.util.Arrays;


public class Main  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int K = Integer.parseInt(temp[1]);
        temp = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i=0;i<N;i++)arr[i] = Integer.parseInt(temp[i]);
        Arrays.sort(arr);

        int sum = 0;
        for(int i=0;i<K;i++){
            sum += arr[i];
        }

        System.out.println(sum);
       
    }


}

