import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
boolean[] cards=new boolean[11];
int count=0;
String[] values=line.split(" ");
int c1=Integer.parseInt(values[0]);
int c2=Integer.parseInt(values[1]);
int c3=Integer.parseInt(values[2]);
cards[c1]=true;
cards[c2]=true;
cards[c3]=true;
for(int i=1;i<=10;i++){
if(!cards[i]&&20-c1-c2>=i){
count++;
}
}
if(count>=4){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}
}