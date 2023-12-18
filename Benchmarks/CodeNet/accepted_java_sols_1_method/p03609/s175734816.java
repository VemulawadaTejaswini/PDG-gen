import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int ans=0;
int x = Integer.parseInt(sc.next());
int t = Integer.parseInt(sc.next());
ans=max(x-t,0);
out.println(ans);
}
}