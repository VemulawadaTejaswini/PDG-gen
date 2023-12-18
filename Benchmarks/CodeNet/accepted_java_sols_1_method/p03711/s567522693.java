import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String x=sc.next();
String y=sc.next();
String g1="1 3 5 7 8 10 12";
String g2="4 6 9 11";
if(x.equals("2")||y.equals("2")){
    out.println("No");
}else if((g1.contains(x)&&g1.contains(y))||(g2.contains(x)&&g2.contains(y))){
    out.println("Yes");
}else{out.println("No");}
}
}