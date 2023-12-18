import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int r = Integer.parseInt(sc.next());
int g = Integer.parseInt(sc.next());
int b = Integer.parseInt(sc.next());
if((100*r+10*g+b)%4==0){out.println("YES");}else{out.println("NO");}
}
}