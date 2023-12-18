import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long N = Long.parseLong(str);
        ArrayList<Long> num = new ArrayList<>();
        long div;
        for (int i=1;i<Math.sqrt(N);i++){
            div = (long)(N-i)/i;
            if (N/div==N%div){
                num.add(div);
            }
        }
        long ans = 0;
        for (long n:num){
            ans += n;
        }
        System.out.println(ans);
    }
}