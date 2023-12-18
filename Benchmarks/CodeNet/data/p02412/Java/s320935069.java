import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true) {
                String[] buff = br.readLine().split("\\s");
                int n = Integer.parseInt(buff[0]), x = Integer.parseInt(buff[1]), count = 0;
                
                if(n==0&&x==0){
                    break;
                }
                
                for(int a=1; a<=n-2; a++) {
                    for(int b=a+1; b<=n-1; b++){
                        for(int c=b+1; c<=n; c++){
                            if(x==a+b+c) {
                                count++;
                            }
                        }
                    }
                }
                
                System.out.println(String.valueOf(count));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
