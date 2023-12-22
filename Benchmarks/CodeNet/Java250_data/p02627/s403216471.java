import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.matches("[A-Z]")){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}