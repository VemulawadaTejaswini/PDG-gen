import java.io.*;
import java.util.Arrays;
 
class Main{
static int[] a=new int[5];
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
while((line=br.readLine())!=null){
String[] value=line.split(",");
a[0]=Integer.parseInt(value[0]);
a[1]=Integer.parseInt(value[1]);
a[2]=Integer.parseInt(value[2]);
a[3]=Integer.parseInt(value[3]);
a[4]=Integer.parseInt(value[4]);
Arrays.sort(a);
if(a[1]==a[4]||a[0]==a[3]){
System.out.println("four card");
}
else if((a[0]==a[2]&&a[3]==a[4])||(a[0]==a[1]&&a[2]==a[4])){
System.out.println("full house");
}
else if((a[0]==a[2])||(a[1]==a[3])||(a[2]==a[4])){
System.out.println("three card");
}
else if((a[0]==a[1]&&a[2]==a[3])||(a[0]==a[1]&&a[3]==a[4])||(a[1]==a[2]&&a[3]==a[4])){
System.out.println("two pair");
}
else if((a[0]==a[1])||(a[1]==a[2])||(a[2]==a[3])||(a[3]==a[4])){
System.out.println("one pair");
}
else if((a[0]+4==a[1]+3&&a[1]+3==a[2]+2&&a[2]+2==a[3]+1&&a[3]+1==a[4])||(a[0]==1&&a[1]==10&&a[2]==11&&a[3]==12&&a[4]==13)){
System.out.println("straight");
}
else{
System.out.println("null");
}
}
}
}