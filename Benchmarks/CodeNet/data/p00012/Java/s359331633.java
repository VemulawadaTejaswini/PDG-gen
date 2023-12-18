import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferReader(new InputStreamReader(System.in));
String str = br.readLine();
Boolean isNull = str.equals("");
while(!isNull){
String[] datas = str.split(" ",8);
double x1 = Double.parseDouble(datas[0]);
double y1 = Double.parseDouble(datas[1]);
double x2 = Double.parseDouble(datas[2]);
double y2 = Double.parseDouble(datas[3]);
double x3 = Double.parseDouble(datas[4]);
double y3 = Double.parseDouble(datas[5]);
double xp = Double.parseDouble(datas[6]);
double yp = Double.parseDouble(datas[7]);
double x = xp-x1;
double y = yp-y1;
double p = x2-x1;
double q = y2-y1;
double r = x3-x1;
double u = y3-y1;
double[] coefficient = Simultaneous(p,r,x,q,u,y);
double s = coefficient[0];
double t = coefficient[1];
if(s<0||t<0){
System.out.println("NO");
}else if(s+t>0 && s+t<1){
System.out.println("YES");
}else{
System.out.println("NO");
}
str = br.readLine();
isNull = str.equals("");

}
}
private static double[] Simultaneous(double a,double b,double c,double d,double e,double f){
double x = (double) (e*c-b*f)/(a*e-b*d);
double y = (double) (a*f-c*d)/(a*e-b*d);
double[] answer = {x,y};
return answer;
}
}