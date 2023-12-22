import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] isNotPrimeNumber = new boolean[1000000];
        isNotPrimeNumber[0] = true;
        for(int i = 1; i<isNotPrimeNumber.length; i++){
            int j = i + i + 1;
            while(j < isNotPrimeNumber.length) {
                isNotPrimeNumber[j] = true;
                j += i + 1;
            }
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(!(input = reader.readLine()).equals("0 0 0")){
            String[] tmp = input.split(" ");
            int a = Integer.parseInt(tmp[0]);
            int d = Integer.parseInt(tmp[1]);
            int n = Integer.parseInt(tmp[2]);
            int count = 0;
            while(true){
                if(!isNotPrimeNumber[a-1]){
                    count++;
                    if(count == n){
                        System.out.println(a);
                        break;
                    }
                }
                a += d;
            }
        }
    }
}