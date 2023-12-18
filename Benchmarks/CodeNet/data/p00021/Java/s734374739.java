import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++){
String str=br.readLine();
String[] s=str.split(" ");
double x1=Double.parseDouble(s[0]);
double y1=Double.parseDouble(s[1]);
double x2=Double.parseDouble(s[2]);
double y2=Double.parseDouble(s[3]);
double x3=Double.parseDouble(s[4]);
double y3=Double.parseDouble(s[5]);
double x4=Double.parseDouble(s[6]);
double y4=Double.parseDouble(s[7]);
System.out.println(((y2-y1)*(x4-x3)==(y4-y3)*(x2-x1))?"YES":"NO");
}
}
}