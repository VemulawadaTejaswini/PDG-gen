import java.util.*;
public class Main {
       public static void main(String[] args){

system.out.println("W H x y r=");
Scanner sc = new Scanner(System.in);
int  w= sc.nextInt();
int  h= sc.nextInt();
int  x= sc.nextInt();
int  y= sc.nextInt();
int  r= sc.nextInt();
int  f= sc.nextInt();

f=0;
if(x+r>w)f=1;
if(y+r>h)f=1;
if(r>x)f=1;
if(r>y)f=1;

if(f==0)syste.out.println("Yes");
else system.out.println("No");

return 0;
}
