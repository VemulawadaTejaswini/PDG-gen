import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        for(int i=1;;i++){
            num = Integer.parseInt(in.readLine());
            if(num==0) break;
            System.out.printf("Case %s: %s%n", i, num);
        }
    }
}