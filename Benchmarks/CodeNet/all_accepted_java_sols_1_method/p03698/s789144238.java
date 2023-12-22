import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String s=sc.next();
int c=0;
    for (char i = 'a'; i <= 'z'; i++) {
        if(s.contains(Character.toString(i)))c++;
    }
    if(c==s.length()){
        out.println("yes");
    }else{
        out.println("no");
    }
}
}