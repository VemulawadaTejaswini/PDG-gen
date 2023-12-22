import java.io.*;
/**
 * Created by TmhrMrs on 2016/04/13.
 */
class Main {
    public static void main(String[] args)throws java.io.IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int a = Integer.parseInt(str);
        System.out.println(a*a*a);
    }
}