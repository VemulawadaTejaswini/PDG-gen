import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
  long n=sc.nextLong();
  long m=sc.nextLong();
long temp1=max(m,n);
long temp2=min(m,n);
n=temp1;
m=temp2;
long ans=0;
if(m==1&&n==1){
ans=1;
}else{
ans=abs(m-2)*(n-2);
}
out.println(ans);
}
}
