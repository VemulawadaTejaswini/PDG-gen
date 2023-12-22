import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        int rm = r;
        r = Integer.parseInt(br.readLine());
        int ans = r-rm;
        if(r<rm) rm = r;
        for(int i = 2; i<n; i++){
            r = Integer.parseInt(br.readLine());
            if(ans<r-rm) ans = r-rm;
            if(r<rm) rm = r;
        }
        System.out.println(ans);
    }
}