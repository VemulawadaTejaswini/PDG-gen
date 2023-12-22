import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,n,m; 
        String line,chr;
        String str;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            str = in.readLine();
            if("-".equals(str)) break;
            n = Integer.parseInt(in.readLine());
            for(i=0;i<n;i++){
                m = Integer.parseInt(in.readLine());
                chr = str.substring(0,m);
                line = str.substring(m,str.length());
                str = line+chr;
            }
            System.out.println(str);
        }
        System.out.flush();
    }
}