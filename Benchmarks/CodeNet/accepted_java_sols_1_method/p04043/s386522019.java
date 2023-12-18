import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
HashMap<Integer,Integer> m=new HashMap<>();
    for (int i = 1; i <= 10; i++) {
        m.put(i, 0);
    }
    for (int i = 0; i < 3; i++) {
        int n=Integer.parseInt(sc.next());
        int c=m.get(n);
        c++;
        m.put(n,c);
    }
    if(m.get(5)==2&&m.get(7)==1){
        out.println("YES");
    }else{
        out.println("NO");
    }
}}