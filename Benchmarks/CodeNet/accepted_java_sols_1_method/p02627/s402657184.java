import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        char c=(char)bu.read();
        if(c>='A' && c<='Z') System.out.print("A");
        else System.out.print('a');
    }
}
