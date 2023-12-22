import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int x=sc.nextInt();
int y=sc.nextInt();
int ans=Integer.MAX_VALUE;
for (int i = 0; i <=100000; i++) {
    ans=min(ans,2*c*i+a*max(0,x-i)+b*max(y-i,0));
}
out.println(ans);
}}