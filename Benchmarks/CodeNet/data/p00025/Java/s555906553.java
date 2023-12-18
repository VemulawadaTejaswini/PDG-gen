import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while((str=br.readLine())!=null){
String[] s=str.split(" ");
String[] t=br.readLine().split(" ");
int[] a=new int[4];
int[] b=new int[4];
a[0]=Integer.parseInt(s[0]);
a[1]=Integer.parseInt(s[1]);
a[2]=Integer.parseInt(s[2]);
a[3]=Integer.parseInt(s[3]);
b[0]=Integer.parseInt(t[0]);
b[1]=Integer.parseInt(t[1]);
b[2]=Integer.parseInt(t[2]);
b[3]=Integer.parseInt(t[3]);
int hit=0;
int blow=0;
for(int i=0;i<4;i++){
for(int j=i;j<4;j++){
if(a[i]==b[j]){
if(i==j){
hit++;
}
blow++;
}
}
}
System.out.println(hit+" "+blow);
}
}
}