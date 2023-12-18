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
        String s=in.next();
        StringBuilder ans=new StringBuilder(s);
        if(s.charAt(s.length()-1)=='s')
            ans.append("es");
        else
            ans.append("s");
        System.out.println(ans.toString());
    }

}
