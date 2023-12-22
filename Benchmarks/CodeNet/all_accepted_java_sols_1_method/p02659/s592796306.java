import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        BigDecimal a=new BigDecimal(s[0]),b=new BigDecimal(s[1]);
        a=a.multiply(b);
        String st=a.toString(); int i=0;
        while(i<st.length() && st.charAt(i)!='.') sb.append(st.charAt(i++));
        System.out.print(sb);
    }
}
