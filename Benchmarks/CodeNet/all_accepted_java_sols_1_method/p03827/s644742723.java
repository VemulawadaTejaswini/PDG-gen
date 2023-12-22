import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int n = Integer.parseInt(sc.next());
    String s=sc.next();
    int x=0,max=0;
    for (int i = 0; i < n; i++) {
        if(s.charAt(i)=='I'){
            x++;
        }else{
            x--;
        }
        max=max(max,x);
    }
    out.println(max);
}}