import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String o=sc.next();
String e=sc.next();
int ol=o.length();
int el=e.length();
String temp=o+e;
String ans="";
for (int i = 0; i <ol+el ; i++) {
    if(i%2==0){
        ans+=Character.toString(temp.charAt(i/2));
    }else{
        ans+=Character.toString(temp.charAt(ol+(i-1)/2));
    }
}
    out.println(ans);
}
}