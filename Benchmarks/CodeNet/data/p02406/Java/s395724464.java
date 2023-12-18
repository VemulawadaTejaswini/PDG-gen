import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=3;i<=n;i++){
            if(check(i)){
                System.out.print(" "+i);
            }
        }
        System.out.print("\n");
    }
    public static boolean check(int n){
        if(n%3==0){
            return true;
        }else{
            while(n>0){
                if(n%10==3){
                    return true;
                }
                n = n /10;
            }
            return false;
        }
    } 
}