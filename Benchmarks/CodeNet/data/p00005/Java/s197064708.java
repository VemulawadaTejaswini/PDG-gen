import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
int a=sc.nextInt();
int b=sc.nextInt();
int c=gcd(a,b);
System.out.printf("%d %d%n",c,a*b/c);
}
}
public static int gcd(int x,int y){
int max=Math.max(x,y);
int min=Math.min(x,y);
if(max%min==0){return min;}
return gcd(min,max%min);
}
}