import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String ans="";
    for (int i = 0; i <3; i++) {
        String s=sc.next();
        s=s.toUpperCase();
        ans=ans+Character.toString(s.charAt(0));
    }
    out.println(ans);
}
}