import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

class Main{
public static void main(String[] args) throws IOException{
final int[] alphas={1,3,5,7,9,11,15,17,19,21,23,25};
final int[] beta={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ArrayList<String> array=new ArrayList<String>();
HashMap<Character,Character> dic=new HashMap<Character,Character>();
int ga=-1;
int gb=-1;
String line;
int n=Integer.parseInt(br.readLine());
while(n-->0){
line=br.readLine();
char[] chararray=line.toCharArray();
for(String s : line.split(" ")){
if(s.length()==4){
array.add(s);
}
}
outside: for(int p=0;p<array.size();p++){
         char[] uc=array.get(p).toCharArray();
         for(int a=0;a<alphas.length;a++){
         for(int b=0;b<beta.length;b++){
         char ct=(char)((alphas[a]*('t'-97)+beta[b])%26+97);
         char ch=(char)((alphas[a]*('h'-97)+beta[b])%26+97);
         char ci=(char)((alphas[a]*('i'-97)+beta[b])%26+97);
         char cs=(char)((alphas[a]*('s'-97)+beta[b])%26+97);
         char ca=(char)((alphas[a]*('a'-97)+beta[b])%26+97);
         if(uc[0]==ct&&uc[1]==ch){
         if((uc[2]==ci&&uc[3]==cs)||(uc[2]==ca&&uc[3]==ct)){
         ga=alphas[a];
         gb=beta[b];
         break outside;
         }
         }
         }
         }
         }
for(int j=0;j<26;j++){
char nc=(char)((ga*j+gb)%26+97);
char c=(char)(j+97);
dic.put(nc,c);
}
for(char cc: chararray){
if(cc>='a'&&cc<='z'){
cc=dic.get(cc);
}
}
System.out.println(chararray);
}
array.clear();
dic.clear();
}
}