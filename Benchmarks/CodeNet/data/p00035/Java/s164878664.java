import java.io.*;

class Main{
public static void main(String[] args){
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
while((line=br.readLine())!=null){
String[] value=line.split(",");
xa=Integer.parseInt(value[0]);
ya=Integer.parseInt(value[1]);
xb=Integer.parseInt(value[2]);
yb=Integer.parseInt(value[3]);
xc=Integer.parseInt(value[4]);
yc=Integer.parseInt(value[5]);
xd=Integer.parseInt(value[6]);
yd=Integer.parseInt(value[7]);
double area1=area(xb-xa,yb-ya,xd-xa,yd-ya)+area(xb-xc,yb-yc,xd-xc,yd-yc);
double area2=area(xa-xb,ya-yb,xc-xb,yc-yb)+area(xa-xd,ya-yd,xc-xd,yc-yd);
if(area1==area2){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}
static double area(double a,double b,double c,double d){
return Math.abs(a*d-b*c)/2;
}
}