import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
int[] num=new int[10];
boolean flag=true;
String ans="0";
for(int i=0;i<13;i++){
num[line.charAt(i)-'0']++;
}
for(int i=1;i<=9;i++){
if(num[i]==4){
continue;
}
for(int j=1;j<=9;j++){
int n[]=num.clone();
n[i]++;
if(n[j]<2){
continue;
}
n[j]-=2;
if(check(n)){
if(flag){
System.out.print(i);
ans="";
flag=false;
break;
}
else{
System.out.print(" "+i);
break;
}
}
}
}
System.out.println(ans);
}
}
private static boolean check(int[] n){
int min=0;
for(int i=1;i<=9;i++){
n[i]%=3;
}
for(int i=1;i<=7;i++){
min=Math.min(Math.min(n[i],n[i+1]),n[i+2]);
if(n[i]!=min){
return false;
}
if(min!=0){
n[i]=0;
n[i+1]-=min;
n[i+2]-=min;
}
if(i==7&&((n[8]|n[9])%3!=0)){
return false;
}
}
return true;
}
}