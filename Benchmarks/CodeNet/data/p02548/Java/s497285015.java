import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int ans=0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i*j>=n)
                    break;
                ans++;
            }
        }
        System.out.println(ans);
    }

}
