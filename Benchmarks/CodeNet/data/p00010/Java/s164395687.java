import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++){
int x1,y1,x2,y2,x3,y3;
x1=sc.nextInt();
y1=sc.nextInt();
x2=sc.nextInt();
y2=sc.nextInt();
x3=sc.nextInt();
y3=sc.nextInt();
int a=(x1*x1-x2*x2)*(y2-y3)-(x2*x2-x3*x3)-(y1-y2)*(y2-y3)*(y3-y1);
int b=2*(x1-x2)*(y2-y3)-2*(x2-x3)*(y1-y2);
int px=a/b;
int py=(px-x2/2-x3/2)*(x3-x2)/(y2-y3)+(y2+y3)/2;
int r=Math.hypot(px-x1,py-y1);
System.out.printf("%d %d %d\n",px,py,r);
}
}
}