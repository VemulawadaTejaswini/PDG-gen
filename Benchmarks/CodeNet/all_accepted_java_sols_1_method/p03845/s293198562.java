import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int[] t=new int[n+1];
for (int i = 1; i <= n; i++) {t[i]=Integer.parseInt(sc.next());}
int m = Integer.parseInt(sc.next());
int[] p=new int[m+1];
int[] x=new int[m+1];
for (int i = 1; i <= m; i++) {p[i]=Integer.parseInt(sc.next());x[i]=Integer.parseInt(sc.next());}
int ans=0;
for(int i:t){
    ans+=i;
}
for (int i =1; i <= m; i++) {out.println(ans-t[p[i]]+x[i]);}
}}