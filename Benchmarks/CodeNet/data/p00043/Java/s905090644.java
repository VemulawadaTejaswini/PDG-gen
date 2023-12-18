import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
int[] num=new int[10];
boolean flag=false;
String ans="0";
for(int i=0;i<13;i++){
num[(int)(line.charAt(i)-'0')]++;
}
outside: for(int i=1;i<=9;i++){
         if(num[i]==4){
         continue;
         }
         for(int j=1;j<=9;j++){
         int[] n=num.clone();
         n[i]++;
         if(n[j]<2){
         continue;
         }
         n[j]-=2;
         if(check(n)){
         if(!flag){
         System.out.print(i);
         ans="";
         flag=true;
         }
         else{
         System.out.print(" "+i);
         }
         continue outside;
         }
         }
         }
System.out.println(ans);
}
}
private static boolean check(int[] n){
int amari=0;
for(int i=0;i<=7;i++){
amari=n[i]%3;
n[i]-=amari;
n[i+1]-=amari;
n[i+2]-=amari;
}
if((n[8]&n[9])%3==0&&(n[8]&n[9])>=0){
return true;
}
return false;
}
}