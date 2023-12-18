import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int x = Integer.parseInt(sc.next());
int a = Integer.parseInt(sc.next());
int b = Integer.parseInt(sc.next());
if(abs(a-x)<abs(b-x)){
    out.println("A");
}else{out.println("B");}
}
}