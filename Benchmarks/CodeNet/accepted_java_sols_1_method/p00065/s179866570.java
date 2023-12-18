import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
HashMap<Integer,Integer> dic=new HashMap<Integer,Integer>();
ArrayList<Integer> array1=new ArrayList<Integer>();
ArrayList<Integer> array2=new ArrayList<Integer>();
boolean flag=false;
while((line=br.readLine())!=null){
if(line.isEmpty()){
flag=true;
continue;
}
String[] words=line.split(",");
int num=Integer.parseInt(words[0]);
if(!flag){
array1.add(num);
}
else{
if(array1.indexOf(num)>=0){
array2.add(num);
}
}
if(!dic.containsKey(num)){
dic.put(num,1);
}
else{
dic.put(num,dic.get(num)+1);
}
}
Collections.sort(array2);
for(int i=0;i<array2.size();i++){
System.out.println(array2.get(i)+" "+dic.get(array2.get(i)));
}
}
}