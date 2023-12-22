import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int X=Integer.parseInt(st.nextToken());
        int T=Integer.parseInt(st.nextToken());
        int sum=0;
        while (N>0){
            N-=X;
            sum+=T;
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
