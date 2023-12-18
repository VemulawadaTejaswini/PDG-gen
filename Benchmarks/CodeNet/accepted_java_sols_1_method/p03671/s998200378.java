import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int c=Integer.parseInt(sc.next());
int ans=0;
if(a<=c&&b<=c){ans+=a+b;}else
if(b<=a&&c<=a){ans+=c+b;}else
if(a<=b&&c<=b){ans+=a+c;}
out.println(ans);
}
}