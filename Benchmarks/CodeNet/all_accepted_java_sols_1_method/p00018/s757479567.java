import java.io.*;
import java.util.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
int[] n=new int[5];
while((str=br.readLine())!=null){
String[] s=str.split(" ");
for(int i=0;i<5;i++){
n[i]=Integer.parseInt(s[i]);
}
Arrays.sort(n);
for(int i=5;i>1;i--){
System.out.print(n[i-1]+" ");
}
System.out.println(n[0]);
}
}
}