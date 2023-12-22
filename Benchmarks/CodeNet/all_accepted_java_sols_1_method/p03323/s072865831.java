import java.io.*;
import java.util.*;
import java.math.*;
class Main
{ 
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] s = br.readLine().split(" ");	
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        if(a<=8 && b<=8)
            out.println("Yay!");
        else
            out.println(":(");
        out.flush();
    }
}