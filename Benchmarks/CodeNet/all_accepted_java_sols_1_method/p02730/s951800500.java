    import java.io.*;
    public class Main{ public static void main(String...args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String subString = br.readLine(); int len = subString.length();
        String r1 = new StringBuilder(subString).reverse().toString(); String s1 = subString.substring(0,(len-1)/2);
        String r2 = new StringBuffer(s1).reverse().toString(); String s2 = subString.substring(((len+3)/2)-1, len);
        String r3 = new StringBuffer(s2).reverse().toString();
        if(subString.equals(r1) && s1.equals(r2) && s2.equals(r3)) System.out.println("Yes");
      	else System.out.println("No");}
    }