import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int[] a=new int[n+1];
int[] b=new int[n+1];
int c=0;    
for (int i = 1; i <= n; i++) {
    a[i]=Integer.parseInt(sc.next());
    if(a[i]!=2){c++;}
}
if(c==n){
    out.println(-1);
}else{
    int temp=1;
    for (int i = 1; i <= n; i++) {
        b[i]=a[temp];
        temp=b[i];
        if(b[i]==2){
            out.println(i);
            break;
        }else if(i==n){
            out.println(-1);
        }
    }
}
}
}