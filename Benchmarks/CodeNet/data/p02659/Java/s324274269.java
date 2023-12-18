import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        double a=Double.parseDouble(s[0]),b=Double.parseDouble(s[1]);
        a*=b;
        BigInteger d=BigDecimal.valueOf(a).toBigInteger();
        //System.out.println(d);
        String st=d.toString(); int i=0;
        while(i<st.length() && st.charAt(i)!='.') sb.append(st.charAt(i++));
        System.out.print(sb);
    }
}
