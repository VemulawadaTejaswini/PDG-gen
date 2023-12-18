import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] in1 = br.readLine().split(" ");
        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = Integer.parseInt(br.readLine());;
        }
        br.close();

        long ans = 0L;

        for(int i = 0; i < N; i++){
            
            if(i > 0 && a[i] > 0 && a[i-1] == 1){
                ans++;
                a[i]--; a[i-1]--;
            }
            
            ans += a[i] / 2;
            a[i] %= 2;
        }

        System.out.println(ans);
    }
}