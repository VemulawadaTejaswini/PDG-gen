import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = Integer.parseInt(s.substring(5, 7));
        if(m<=4){
            System.out.println("Heisei");
        }else{
            System.out.println("TBD");
        }
    }
}
