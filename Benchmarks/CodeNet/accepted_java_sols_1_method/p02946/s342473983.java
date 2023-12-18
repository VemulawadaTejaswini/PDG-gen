import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String[] t=str.split("\\ ");
        int K=Integer.parseInt(t[0]); int X=Integer.parseInt(t[1]);
        int l=X-K+1;
        int r=X+K-1;
        for(int i=Math.max(-1000000, l);i<=Math.min(1000000,r);i++){
            System.out.print(i+" ");
        }
    }
    
}
