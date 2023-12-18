import java.io.*:
import java.util.ArrayList;
import java.util.HashMap;

class Main{
public static void main(String[] args) throws IOException{
final static int[] alphas={3,5,7,9,11,15,17,19,21,23,25};
final static int[] beta={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line;
line=br.readLine();
int n=Integer.parseInt(line);
for(int i=0;i<n;i++){
int ga;
int gb;
line=br.readLine();
String[] str=line.split(" ");
char[] chararray=line.toCarArray();
ArrayList<String> array=new ArrayList<String>();
HashMap<Character,Character> dic=new HashMap<Character,Character>();
for(String s : str){
if(s.length()==4){
array.add(s);
}
}
int[] uc=new int[4]
loop1: for(String ss : array){
       for(int p=0;p<4;p++){
       uc[p]=ss.charAt(p);
       }
       for(int a=0;a<alphas.length;a++){
       for(int b=0;b<beta.length;b++){
       char ct=(alphas[a]*('t'-97)+beta[b])%26+97;
       char ch=(alphas[a]*('h'-97)+beta[b])%26+97;
       char ci=(alphas[a]*('i'-97)+beta[b])%26+97;
       char cs=(alphas[a]*('s'-97)+beta[b])%26+97;
       char ca=beta[b]%26+97;
       if((uc[0]==ct&&uc[1]==ch&&uc[2]==ci&&uc[3]==cs)||(uc[0]==ct&&uc[1]==ch&&uc[2]==ca&&uc[3]==ct)){
       ga=alphas[a];
       gb=beta[b];
       break loop1;
       }
       }
       }
       }
for(int i=0;i<26;i++){
char nc=(ga*i+gb)%26+97;
char c=i+97;
dic.put(nc,c);
}
for(char cc : chararray){
if(cc>='a'&&cc<='z'){
cc=dic.get(cc);
}
}
System.out.println(chararray);
}
}
}