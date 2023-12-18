import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] data = new int[1000000];
        boolean[] isPrime = new boolean[1000000];
        //default??§false. ?´???°????????°false,?´???°??§??????????????°true??¨??????.
        data[0] = 0;
        data[1] = 0;
        data[2] = 1;
        isPrime[0] = true;
        isPrime[1] = true;
        int count = 1;
        
        for(int i = 3; i < 1000000; i += 2){
            if(!isPrime[i]){
                data[i] = ++count;
                for(int j = i+1; j < 1000000; j++){
                    if(j%i == 0)    isPrime[j] = true;
                }
            }
        }

        String line;

        while( (line = br.readLine()) != null){
            System.out.println(data[Integer.parseInt(line)]);
        }
        
    }
}