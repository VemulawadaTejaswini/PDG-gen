import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int max=a;
        int min=a;
        long total=a;
        for(int i=1;i<n;i++){
            int b = Integer.parseInt(str[i]);
            if(max<b) max=b;
            if(min>b) min=b;
            total = total + b;
        }
        System.out.println(min+" "+max+" "+total);
    }
}