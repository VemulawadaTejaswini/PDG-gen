import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        int cnt=0;

        if(e-d<=k && e-c<=k && e-b<=k && e-a<=k)
            cnt++;

        if(d-c<=k && d-b<=k && d-a<=k)
            cnt++;

        if(c-b<=k && c-a<=k)
            cnt++;

        if(b-a<=k)
            cnt++;

        if(cnt==4)
            System.out.println("Yay!");
        else
            System.out.println(":(");

    }
}
