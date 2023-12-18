import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
int count=0;
int[] n=new int[10];
for(int i=0;i<13;i++){
n[line.charAt(i)-'0']++;
}
for(int i=1;i<=9;i++){
for(int j=1;j<=9;j++){
n[i]++;
if(n[j]<2){
continue;
}
else{
n[j]-=2;
if(check(n)){
if(count==0){
System.out.print(i);
count++;
}
else{
System.out.print(" "+i);
}
}
}
}
}
System.out.println("");
}
}
private static boolean check(int[] n){
int min=0;
for(int i=1;i<=9;i++){
n[i]%=3;
}
for(int i=1;i<=7;i++){
min=Math.min(n[i],n[i+1]);
min=Math.min(min,n[i+2]);
n[i]-=min;
n[i+1]-=min;
n[i+2]-=min;
if(n[i]!=0){
return false;
}
if(i==7&&(n[8]|n[9])!=0){
return false;
}
}
return true;
}
}