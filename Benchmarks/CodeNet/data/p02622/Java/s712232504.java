
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] A = br.readLine().toCharArray();

        char[] B = br.readLine().toCharArray();

        int cnt = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] != B[i])cnt++;
        }

        System.out.println(cnt);


    }
}
