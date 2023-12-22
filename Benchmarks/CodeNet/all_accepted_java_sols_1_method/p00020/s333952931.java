import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
while((str=br.readLine())!=null){
char[] ch=str.toCharArray();
for(int i=0;i<ch.length;i++){
if(ch[i]>='a'&&ch[i]<='z'){
ch[i]-=32;
}
}
System.out.println(ch);
}
}
}