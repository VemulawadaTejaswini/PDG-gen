import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String s=sc.next();
StringBuilder sb=new StringBuilder();
sb.append(s);
    for (int i = 0; i < s.length(); i++) {
        if(i%2==1)sb.setCharAt(i, '-');
    }
    s=sb.toString();
    s=s.replaceAll("-", "");
out.println(s);
}
}