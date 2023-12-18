import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    if(b<=c||d<=a){out.println(0);}else{
    out.println(abs(max(a,c)-min(b,d)));}
}
}