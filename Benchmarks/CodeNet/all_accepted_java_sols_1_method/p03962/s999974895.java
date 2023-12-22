import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int c=Integer.parseInt(sc.next());
Set<Integer>s=new HashSet();
s.add(a);
s.add(b);
s.add(c);
System.out.println(s.size());

}
}