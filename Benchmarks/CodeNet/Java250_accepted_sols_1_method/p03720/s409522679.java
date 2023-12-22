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
HashMap<Integer,Integer> map=new HashMap<>();
for (int i = 0; i < m; i++) {
    a[i]=Integer.parseInt(sc.next());
    b[i]=Integer.parseInt(sc.next());
}
    for (int i = 1; i <= n; i++) {
        map.put(i, 0);
    }
    for (int i = 0; i < m; i++) {
        int c=map.get(a[i])+1;
        map.put(a[i], c);
        c=map.get(b[i])+1;
        map.put(b[i], c);
    }
    for (int i = 1; i <= n; i++) {
        out.println(map.get(i));
    }
}
}
