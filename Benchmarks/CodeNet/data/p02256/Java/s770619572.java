import java.io.*;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st=new StringTokenizer(line);
int a=Integer.parseInt(st.nextToken());
int b=Integer.parseInt(st.nextToken());
out.println(gcd(Math.max(a,b),Math.min(a,b)));
out.flush();
}
}

private static long gcd(int a,int b){
if(b==0) return a;
return gcd(b,a%b);
}
}