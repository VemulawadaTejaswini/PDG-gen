import java.io.*;
import java.util.Arrays;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
int maxValue;
int minValue;
int dif;
int[] num=new int[8];
int n=Integer.parseInt(br.readLine());
for(int p=0;p<n;p++){
line=br.readLine();
maxValue=0;
minValue=0;
dif=0;
for(int i=0;i<num.length;i++){
num[i]=(int)(line.charAt(i)-'0');
}
Arrays.sort(num);
for(int i=0;i<num.length;i++){
maxValue+=num[i]*Math.pow(i);
minValue+=num[i]*Math.pow(7-i);
}
dif=maxValue-minValue;
System.out.println(dif);
}
}
}