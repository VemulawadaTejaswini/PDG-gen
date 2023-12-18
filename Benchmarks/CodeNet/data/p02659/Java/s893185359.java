import java.math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.*;
public class Main {
    public static void main(String args[])throws IOException
    {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        in.nextToken();
        long a = (long)in.nval;
        in.nextToken();
        long b = (long)(100*in.nval);
        out.println((long)((a*b)/100));
        out.flush();
    }
                  }