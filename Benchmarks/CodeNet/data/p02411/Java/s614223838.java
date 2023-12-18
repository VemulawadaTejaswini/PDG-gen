import java.io.*;
class Main{
public static void main(String[] args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int[][] sum = new int[100000][3];
int a=0;
while(true){
a++;
String x=br.readLine();
String y=br.readLine();
String z=br.readLine();
sum[0][0]=Integer.parseInt(x);
sum[0][1]=Integer.parseInt(y);
sum[0][2]=Integer.parseInt(z);
if(sum[0][0]==-1&&sum[0][1]==-1&&sum[0][2]==-1)
break;
int S;
S=sum[0][0]+sum[0][1];
if(sum[0][0]==-1||sum[0][1]==-1){
if(S>=80)
System.out.println("A");
else if(S>=65)
System.out.println("B");
else if(S>=50)
System.out.println("C");
else if(S>=30&&sum[0][2]>=50)
System.out.println("C");
else if(S>=30)
System.out.println("D");
else
System.out.println("F");
}
else
System.out.println("F");

}
}
}