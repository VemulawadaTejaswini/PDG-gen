import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int a = Integer.parseInt(sc.next());
String op=sc.next();
int b = Integer.parseInt(sc.next());
if(op.equals("+")){
    out.println(a+b);
}else{
    out.println(a-b);
}
}}