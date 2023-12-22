import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")){
            System.out.println("vowel");
        }else{
            System.out.println("consonant");
        }
    }
}
