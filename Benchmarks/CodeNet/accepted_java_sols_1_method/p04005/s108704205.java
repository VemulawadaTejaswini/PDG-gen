import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        //int N = Integer.parseInt(br.readLine());
        long A = Long.parseLong(in1[0]);
        long B = Long.parseLong(in1[1]);
        long C = Long.parseLong(in1[2]);
        br.close();

        long ans = 0L;
        if(A%2 != 0 && B%2 != 0 && C%2 != 0){
            ans = Math.min(A * B, B * C);
            ans = Math.min(ans, C * A);
        }

        System.out.println(ans);
    }
}