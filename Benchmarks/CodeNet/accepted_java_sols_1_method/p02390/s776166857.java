import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
    public static void main(String[] args){
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            int h = a / 3600;
            int m = a % 3600 / 60;
            int s = a % 3600 % 60;
            System.out.printf("%d:%d:%d\n", h, m, s);
        }
        catch (IOException e){
            
        }
    }
}
