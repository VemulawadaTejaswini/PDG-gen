import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
         BufferedReader in = new BufferedReader(new
                                    InputStreamReader(System.in));
         for (int i = 0; i < 10; ++i)
         {
              String line = in.readLine();
              int a = Integer.parseInt(line);
              System.out.println(a);
         }
    }
}