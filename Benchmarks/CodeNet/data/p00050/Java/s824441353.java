import java.io.*;
 
class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
String[] words=line.split(" ");
for(int i=0;i<words.length;i++){
if(words[i].length()==5){
if(words[i].equals("peach")){
System.out.print("apple");
}
if(words[i].equals("apple")){
System.out.print("peach");
}
}
if(words[i].length()==6){
if(words[i].equals("peach.")){
System.out.print("apple.");
}
if(words[i].equals("apple.")){
System.out.print("peach.");
}
}
else{
System.out.print(words[i]);
}
if(i==words.length-1){
System.out.println("");
}
else{
System.out.print(" ");
}
}
}
}
}