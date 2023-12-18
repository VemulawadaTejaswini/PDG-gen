import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x=Integer.parseInt(sc.next());
int y=Integer.parseInt(sc.next());
int s=Integer.parseInt(sc.next());
int max=0,z1,z2;
for(int i=0;i<=s;i++){
z1=100*i/(100+x);
z2=100*(s-i)/(100+x);
max=Math.max(z1*(100+y)/100+z2*(100+y)/100,max);
}
System.out.println(max);
}
}
