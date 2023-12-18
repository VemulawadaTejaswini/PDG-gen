import java.util.Scanner;
public class Main{
public static void main( String [] args){
Scanner in= new Scanner( System.in);
int c,t,X,Y,e,f,m,n,i,j;
c= 2;
t= 4;
m= 0;
X= in.nextInt();
Y= in.nextInt();
for (i=0;i<=X; i++){
e= c*i;
for (j= 0;  j <= X; j++){
f= t*j;
n= e+f;
if (n==Y){
m++;
}
}
} if (m==0){
System.out.println ("No");
}else {
 System.out.println ("Yes");
  }
}
}