import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String s=sc.next();
int l=0,r=0;
    for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i)=='A'){l=i;break;}
    }
    for (int i = s.length()-1; i >=0; i--) {
        if(s.charAt(i)=='Z'){r=i+1;break;}
    }
    out.println(s.substring(l,r).length());
}}