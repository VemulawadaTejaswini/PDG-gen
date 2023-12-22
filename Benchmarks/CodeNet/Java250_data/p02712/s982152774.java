import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        long count=0;
        for (int i = 1; i <=n ; i++) {
            if(i%3==0 || i%5==0)
                continue;
            else
                count+=i;
        }
        System.out.println(count);
    }
}