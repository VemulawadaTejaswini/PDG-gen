

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String c = "s";
        String d = "es";
        if(s.endsWith("s"))
        {
            s = s+d;
        }
        else
        {
            s = s+c;
        }
      System.out.println(s);
    }
}
