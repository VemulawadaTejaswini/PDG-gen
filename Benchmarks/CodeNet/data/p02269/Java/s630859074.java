import java.io.*;
import java.util.ArrayList;
import java.util.StingTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

static class Dictionary{

ArrayList<String> array=new ArrayList<String>();

void insert(String str){
array.add(str);
}

boolean find(String str){
return (array.indexOf(str)<0)?false:true;
}
}

public static void main(String[] args) throws IOException{
long start=System.currentTimeMillis();
solve();
long end=System.currentTimeMillis();
//out.println(end-start+"ms");
out.flush();
}

private static void solve(){
BufferedReader br=BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine)!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
Dictionary d=new Dictionary();
for(int i=0;i<n;i++){
StringTokenizer st=new StringTokenizer(br.readLine());
String command=st.nextToken();
String str=st.nextToken();
if("insert".equals(str)){
d.insert(str);
}
if("find".equals(str)){
out.println(d.find(str)?"yes":"no);
}
}
}