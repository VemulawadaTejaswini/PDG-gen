import java.io.*;
import java.util.StringTokenizer;
     
class Main{

static final PrintWriter out=new PrintWriter(System.out);

public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num=Integer.parseInt(br.readLine());
int[] heap=new int[num+1];
int parent,left,right;
StringBuilder sb;
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<num;i++){
heap[i+1]=Integer.parseInt(st.nextToken());
}
for(int i=1;i<=num;i++){
sb=new StringBuilder();
sb.append("node ");
sb.append(i);
sb.append(": key = ");
sb.append(heap[i]);
parent=i/2;
left=i*2;
right=i*2+1;
if(parent>=1&&parent<=num){
sb.append(", parent key = ");
sb.append(heap[parent]);
}
if(left>=1&&left<=num){
sb.append(", left key = ");
sb.append(heap[left]);
if(right>=1&&right<=num){
sb.append(", right key = ");
sb.append(heap[right]);
}
sb.append(", ");
out.println(sb);
}
out.flush();
}
}