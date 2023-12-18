import java.util.*;
import java.awt.*;
import java.math.BigInteger;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        int n=s.length();
        if(s.length()<4){
            out.println("No");
        }else{
            s=s.substring(0,4);
            if(s.equals("YAKI")){
                out.println("Yes");
            }else{
                out.println("No");
            }
        }
    }
}