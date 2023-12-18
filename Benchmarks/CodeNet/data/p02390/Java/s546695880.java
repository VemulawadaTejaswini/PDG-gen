import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
        String aaa = S.readLine();
        int Num = Integer.parseInt(aaa);
        calcTime calc = new calcTime(Num);
    }
}

class calcTime{
    public calcTime(int inputS){        //コンストラクタ
        int a,b,h,m,s;
        a = inputS % 3600;
        h = inputS / 3600;
        b = a % 60;
        m = a / 60;
        s = b % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
