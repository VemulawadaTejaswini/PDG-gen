import java.io.*;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
StringTokenizer st=new StringTokenizer(line);
int h=Integer.parseInt(st.nextToken());
int w=Integer.parseInt(st.nextToken());
int[][] wf=new int[h][w];
for(int i=0;i<h;i++){
boolean flag=false;
char[] map=br.readLine().toCharArray();
for(int j=0;j<w;j++){
if(map[j]=='c'){
wf[i][j]=0;
flag=true;
}
else{
if(!flag) wf[i][j]=-1;
else wf[i][j]=wf[i][j-1]+1;
}
if(j==w-1) out.println(wf[i][j]);
else out.print(wf[i][j]+" ");
}
}
out.flush();
}
}
}