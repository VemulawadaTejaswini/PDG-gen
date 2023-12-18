import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PriorityQueue???pque=new PriorityQueue(10,new Comparator(){
public int compare(Object o1,Object o2){
int n1=(int)o1;
int n2=(int)o2;
return (n1>n2)?1:(n1<n2)?-1:0;
});
int num=Integer.parseInt(br.readLine());
int n;
while(num-->0){
StringTokenizer st=new StringTokenizer(br.readLine());
String command=st.nextToken();
if("insert".equals(command)){
n=Integer.parseInt(st.nextToken());
pque.offer(n);
}
else out.println(pque.poll());
}
out.flush();
}
}