import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
int[] a=new int[m];
int[] b=new int[m];
int[] road=new int[n+1];
    for (int i = 0; i < m; i++) {
        a[i]=Integer.parseInt(sc.next());
        b[i]=Integer.parseInt(sc.next());
        road[a[i]]++;
        road[b[i]]++;
    }
    for (int i =1; i <= n; i++) {
        out.println(road[i]);
    }
}
}