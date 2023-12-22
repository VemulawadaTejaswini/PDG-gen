import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,ans;
        String str;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            str = in.readLine();
            if(str.equals("0")) break;
            char[] c = str.toCharArray();
            ans=0;
            for(i=0;i<str.length();i++){
                ans+=Integer.parseInt(String.valueOf(c[i]));
            }
            System.out.println(ans);
        }
        System.out.flush();
    }
}