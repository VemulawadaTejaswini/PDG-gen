import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(isPrime(br.readLine()))cnt++;
        }
    }
    public static boolean isPrime(int x){
        if(x % 2 == 0)return false;
        else if(x % 3 == 0)return false;

        for(int i=5; i*i<=x; i+=6){
            if(x % i == 0)return false;
            if(x % (i + 2) == 0)return false;
        }
        return true;
    }
}