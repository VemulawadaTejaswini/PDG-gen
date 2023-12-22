import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        String strS,strP;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        strS = in.readLine();
        strP = in.readLine();
        StringBuffer sb = new StringBuffer(strS);
        sb.append(strS);
        System.out.println((sb.indexOf(strP)==-1 ? "No" : "Yes"));
        System.out.flush();
    }
}