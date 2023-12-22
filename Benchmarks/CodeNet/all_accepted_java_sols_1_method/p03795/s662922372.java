import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int ans=0;
int n = Integer.parseInt(sc.next());
for (int i = 1; i <= n; i++) {
    ans+=800;
    if(i%15==0)ans-=200;
}
    out.println(ans);
}}