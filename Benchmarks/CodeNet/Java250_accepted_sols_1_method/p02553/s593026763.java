

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        long a=Long.parseLong(s[0].trim());
        long b=Long.parseLong(s[1].trim());
        long c=Long.parseLong(s[2].trim());
        long d=Long.parseLong(s[3].trim());
        long res=Math.max(Math.max(a*c,a*d),Math.max(b*c,b*d));
        System.out.println(res);


    }



}
