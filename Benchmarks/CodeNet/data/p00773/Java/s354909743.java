import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x=Integer.parseInt(sc.next());
int y=Integer.parseInt(sc.next());
int s=Integer.parseInt(sc.next());
int max=0;
double z1,z2;
for(int i=0;i<=s;i++){
z1=100*i/(100+x);
z2=100*(s-i)/(100+x);
z1=(100+y)*z1/100;
z2=(100+y)*z2/100;
int z3=(int)(z2+z1);
max=Math.max(z3,max);
}
System.out.println(max);
}
}
