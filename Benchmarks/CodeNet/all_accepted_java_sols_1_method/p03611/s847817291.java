import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n=sc.nextInt();
int[] a=new int[n];
int[] x=new int[100003];
for (int i = 0; i < n; i++) {
    a[i]=sc.nextInt();
}
for (int i = 0; i < n; i++) {
    if(a[i]-1<0){
        x[100002]++;
        x[a[i]+1]++;
        x[a[i]]++;
    }else{
        x[a[i]+1]++;
        x[a[i]]++;
        x[a[i]-1]++;
    }
}
Arrays.sort(x);
out.println(x[100002]);
}}