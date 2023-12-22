import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String s=sc.next();
if(s.length()==2){out.println(0);
}else{
    for (int i = 1; i <s.length(); i++) {
    String temp1=s.substring(0,(s.length()-i*2)/2);
    String temp2=s.substring((s.length()-i*2)/2,s.length()-i*2);
    if(temp1.equals(temp2)){
        out.println(2*temp1.length());
        break;
    }
    }
}
}
}