import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String a=sc.next();
String b=sc.next();
for(int i=0;i<100-a.length();i++){
a="0"+a;
}
for(int i=0;i<100-b.length();i++){
b="0"+b;
}
if(a.compareTo(b)>0){
    out.println("GREATER");
}else if(a.compareTo(b)<0){
    out.println("LESS");
}else{
    out.println("EQUAL");
}
}
}