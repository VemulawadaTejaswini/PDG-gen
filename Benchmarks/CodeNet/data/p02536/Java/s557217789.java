import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        int[] town = new int[N];
        int A,B;
        for(int i=0;i<M;i++){
            line = br.readLine().split(" ");
            A = Integer.parseInt(line[0]);
            B = Integer.parseInt(line[1]);
            town[A-1]++;
            town[B-1]++;
        }

        int ans = 0;
        for(int i=0;i<N;i++){
            if(town[i]<2) ans++;
        }
        System.out.println(ans/2);
    }
}
