import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static long n,a,b,k;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        String s = sc.next();
        int a = Integer.parseInt(s.substring(0,2));
        int b = Integer.parseInt(s.substring(2,4));
        boolean YYMM = false, MMYY = false;
        if(a<=12&&a>=1) MMYY = true;
        if(b<=12&&b>=1) YYMM = true;
        String ans;
        if(YYMM&&MMYY) ans = "AMBIGUOUS";
        else if(YYMM&&(!MMYY)) ans = "YYMM";
        else if((!YYMM)&&(MMYY)) ans = "MMYY";
        else ans = "NA";
        System.out.println(ans);
    }

}

