import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int num = 0;
        
        for (int i = 0; i < cnt ; i++){
            int n = Integer.parseInt(br.readLine());
            if(isPrime(n))num = num + 1;
        }
        System.out.println(num);
    }
    
    public static boolean isPrime(int x){
        int j = 0;
        if(x==2)return true;
        if(x%2==0 | x<2)return false;
        j = 3;
        while(j <= Math.sqrt(x)){
            if(x%j==0)return false;
            j = j + 2;
        }
        return true;
    }
};
