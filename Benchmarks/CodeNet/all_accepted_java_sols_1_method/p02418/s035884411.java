import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine(), str = s + s;
        String patt = in.nextLine();

        if(str.indexOf(patt) >= 0)System.out.println("Yes");
        else System.out.println("No");
    }
}
