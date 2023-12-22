import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        char ch;
        ch=(char)System.in.read();
        if(Character.isUpperCase(ch))
            System.out.println("A");
        else
            System.out.println("a");
    }
}
