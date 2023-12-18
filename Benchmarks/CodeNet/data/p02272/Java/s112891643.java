import java.io.*;
import java.util.StringTokenizer;
 
class Main{
 
static final PrintWriter out=new PrintWriter(System.out);
static int[] buff;
static int ans=0;
 
static void __mergeSort(int[] a,int left,int right){
if(left<right){
int i;
int mid=(left+right)/2;
int p=0;
int j=0;
int k=0;
__mergeSort(a,left,mid);
__mergeSort(a,mid+1,right);
for(i=left;i<=mid;i++)
   buff[p++]=a[i];
while(i<=right&&j<p){
   a[k++]=(buff[j]<=a[i])?buff[j++]:a[i++];
   ans++;
}
while(j<p)
   a[k++]=buff[j++];
}
}
 
static void mergeSort(int[] a,int n){
buff=new int[n];
__mergeSort(a,0,n-1);
buff=null;
}
 
static void getValue(int[] a){
for(int i=0;i<a.length-1;i++) out.print(a[i]+" ");
out.println(a[a.length-1]);
}
 
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null&&!line.isEmpty()){
int n=Integer.parseInt(line);
int[] a=new int[n];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
mergeSort(a,n);
getValue(a);
out.println(ans);
}
out.flush();
}
}