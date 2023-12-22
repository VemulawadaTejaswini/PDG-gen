import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int taro=0,hanako=0;
        while(n-->0){
            String str[] = br.readLine().split(" ");
            if(str[0].compareToIgnoreCase(str[1])==0){
                taro++;
                hanako++;
            }else if(str[0].compareToIgnoreCase(str[1])>0){
                taro += 3;
            }else{
                hanako += 3;
            }
        }
        System.out.println(taro+" "+hanako);
    }
}