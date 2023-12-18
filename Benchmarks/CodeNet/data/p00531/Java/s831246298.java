import java.io.*;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int a=Integer.parseInt(line);
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
int d=Integer.parseInt(br.readLine());
int p=Integer.parseInt(br.readLine());
int x=a*p;
int y=(p>=c)?b+(p-c)*d:b;
out.println(Math.min(x,y));
out.flush();
}
}