import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String args[])
    {
     String s;int a=0;
     Scanner sc=new Scanner(System.in);
     s=sc.next();
     if(s.equals("MON"))
     {
         a=6;
     }
     else if(s.equals("TUE"))
     {
         a=5;
     }
     else if(s.equals("WED"))
     {
         a=4;
     }
     else if(s.equals("THU"))
     {
         a=3;
     }
     else if(s.equals("FRI"))
     {
         a=2;
     }
     else if(s.equals("SAT"))
     {
         a=1;
     }
     else if(s.equals("SUN"))
     {
         a=7;
     }
     System.out.println(a);
    }
}

