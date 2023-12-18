import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //long a = sc.nextInt();
        String s = sc.next();
        //char c = s.charAt(s.length()-1);
        if(s.charAt(s.length()-1)=='s'){
            System.out.println(s+"es");
        }else{
            System.out.println(s+"s");
        }
        
    }
}
