import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PriorityQueue<Integer> pque=new PriorityQueue<Integer>(10,new Comparator<Integer>(){
public int compare(Integer a,Integer b){
return (a>b)?-1:(a<b)?1:0;
}
});

int num=Integer.parseInt(br.readLine());
while(num-->0){
StringTokenizer st=new StringTokenizer(br.readLine());
String command=st.nextToken();
if("insert".equals(command)){
int n=Integer.parseInt(st.nextToken());
pque.offer(n);
}
else out.println(pque.poll);
}
out.flush();
}
}