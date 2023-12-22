import java.io.*;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
int cnt=0;
for(int i=0;i<5;i++){
n=Integer.parseInt(br.readLine());
cnt+=(n>=40)?n:40;
}
out.println(cnt/5);
out.flush();
}
}