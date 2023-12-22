import java.io.*;
import java.util.StringTokenizer;
 
class Main{
 
static final PrintWriter out=new PrintWriter(System.out);
 
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
int[] a=new int[n];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
InsertionSort(a);
out.flush();
}
}
 
static void InsertionSort(int[] a){
getValue(a);
for(int i=1;i<a.length;i++){
int j=i-1;
int tmp=a[i];
while(j>=0&&a[j]>tmp){
a[j+1]=a[j];
a[j]=tmp;
j--;
}
getValue(a);
}
}
 
private static void getValue(int[] a){
for(int i=0;i<a.length-1;i++) out.print(a[i]+" ");
out.println(a[a.length-1]);
}
}
