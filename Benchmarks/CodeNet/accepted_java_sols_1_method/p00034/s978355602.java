import java.io.*;class Main{
public static void main(String[]_)throws Exception{
int i,a,x,y;
float b;
BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
for(String s;(s=B.readLine())!=null;){
_=s.split(",");
x=Integer.valueOf(_[10]);
y=Integer.valueOf(_[11]);
for(a=i=0;i<10;)a+=Integer.valueOf(_[i++]);
b=x+y;
b=a*x/b;
for(a=i=0;i<10;i++){
a+=Integer.valueOf(_[i]);
if(b<=a){
System.out.println(i+1);
break;
}
}
}
}
}