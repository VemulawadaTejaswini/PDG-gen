import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n=sc.nextInt();
int[] a=new int[n];
int c=0,d=0;
for (int i = 0; i < n; i++) {
    a[i]=sc.nextInt()%4;
    if(a[i]==0)c++;
    if(a[i]==2)d++;
}
String ans;
if(d==0){
    if(n-c<=c+1){
        ans="Yes";
    }else{
        ans="No";
    }
}else if(n-d+1-c<=c+1){
    ans="Yes";
}else{
    ans="No";
}
out.println(ans);
}}