import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String s=sc.next();
    out.print(s.charAt(0));
    out.print(s.length()-2);
    out.println(s.charAt(s.length()-1));    
}
}