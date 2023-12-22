import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
        String s=scan.next();

        if(s.contains("00")) System.out.print("Bad");
            else if(s.contains("11")) System.out.print("Bad");
            else if(s.contains("22")) System.out.print("Bad");
            else if(s.contains("33")) System.out.print("Bad");
            else if(s.contains("44")) System.out.print("Bad");
            else if(s.contains("55")) System.out.print("Bad");
            else if(s.contains("66")) System.out.print("Bad");
            else if(s.contains("77")) System.out.print("Bad");
            else if(s.contains("88")) System.out.print("Bad");
            else if(s.contains("99")) System.out.print("Bad");
            else System.out.print("Good");

    }

}