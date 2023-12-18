import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
int[] n=new int[10];
for(int i=0;i<13;i++){
n[(int)(line.charAt(i)-'1'+1)]++;
}
for(int i=1;i<=9;i++){
if(n[i]<2){
continue;
}
else{
n[i]-=2;
if(check(n)){
System.out.println(i+" ");
}
}
}
System.out.println("");
}
}
private static boolean check(int[] n){
it min=0;
for(int i=1;i<=9;i++){
n[i]%=3;
}
for(int i=1;i<=7;i++){
min=Math.min(n[i],n[i+1]);
min=Math.min(min,n[i+2]);
n[i]-=min;
n[i+1]-=min;
n[i+2]-=min;
}
for(int i=1;i<=9;i++){
if(n[i]!=0){
return false;
}
}
return true;
}
}