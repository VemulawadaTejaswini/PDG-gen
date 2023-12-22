
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int i=0;
for(;;){
int n =sc.nextInt();
int m =sc.nextInt();
if(n==0 && m==0) break;
if(n>m){ i=n; n=m; m=i;} 
System.out.println(n+" "+m);
}
}
}