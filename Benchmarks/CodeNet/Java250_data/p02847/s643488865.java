import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if (a.equals("SUN"))
            System.out.println("7");
        else if (a.equals("MON"))
            System.out.println("6");
        else if (a.equals("TUE"))
            System.out.println("5");
        else if (a.equals("WED"))
            System.out.println("4");
        else if (a.equals("THU"))
            System.out.println("3");
        else if (a.equals("FRI"))
            System.out.println("2");
        else if (a.equals("SAT"))
            System.out.println("1");
    }
}
