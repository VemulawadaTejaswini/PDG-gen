import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int N,Y;
        N = Integer.parseInt(tmp[0]); 
        Y = Integer.parseInt(tmp[1]);
        int x,y,z;
        x = -1; y = -1; z = -1;
        
        if(Y >= 100000){
            for(int i=0; i<=N; i++){
                for(int j=0; j<=N-i; j++){
                    if(Y == 10000*i + 5000*j + 1000*(N-i-j)){
                        x = i; y = j; z = N-i-j;
                    }
                }
            }
        } else {
            for(int i=0; i<=N; i++){
                for(int j=0; j<=N-i; j++){
                    if(Y == 1000*i + 5000*j + 10000*(N-i-j)){
                        x = N-i-j; y = j; z = i;
                    }
                }
            }
        }
        System.out.println(x + " " + y + " " +z);
    }
}