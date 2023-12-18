import java.io.*;
public class Main {
 static int loc=0;
 static int line=0;
 static String str[];
 static String buffer="";
 static String str2="";
 static String str3="";
 public static void main(String[] args){
 try{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  str=new String[1000];
  int a;
  int j=0;
  while (true) {
   String str1 = br.readLine();
   if(str1.equals("END_OF_TEXT")){a=j; break;}
   str[j]=str1;
   j++;
  }
  while(true){
   char ch=br.readLine().charAt(0);
   if(ch=='-') break;
   else if(ch=='a')a();
   else if(ch=='e')e();
   else if(ch=='p')p();
   else if(ch=='n')n(a);
   else if(ch=='f')f(a);
   else if(ch=='b')b(a);
   else if(ch=='d')d(a);
   else if(ch=='k')k(a);
   else if(ch=='y')y(a);
  }
  for(int i=0;i<a;i++)System.out.println(str[i]);
 }
 catch(Exception e){System.out.println("err");}
 }

 public static void a(){
  loc=0;
 }
 public static void e(){
  loc=str[line].length();
 }

 public static void p(){
  loc=0;
  if(line!=0)line--;
 }
 public static void n(int a){
  loc=0;
  if(line!=a-1)line++;
 }
 public static void f(int a){
  if(loc != str[line].length())loc++;
  else if(loc==str[line].length() && line!=a-1) {
   loc=0;
   line++;
  }
 }
 public static void b(int a){
  if(loc!=0)loc--;
  else if(loc==0 && line!=0)loc=str[--line].length();
 }
 public static void d(int a){
  if(loc!=str[line].length()){
   str2=str[line].substring(0, loc)+str[line].substring(loc+1);
   str[line]="";
   str[line]+=str2;
  }
  else if(loc==str[line].length() && line!=a-1){
   str[line]+=str[line+1];
   str[line+1]="";
   for(int i=line+2;i<a;i++){
    str[i-1]+=str[i];
    str[i]="";
   }
   a--;
  }
 }

 public static void k(int a){
  if(loc!=str[line].length()){
   buffer=str[line].substring(loc);
   str2=str[line].substring(0, loc);
   str[line]="";
   str[line]+=str2;
  } 
  else if(loc==str[line].length() && line!=a-1){
   buffer="\n";
   for(int i=line+1;i<a;i++){
    str[i-1]+=str[i];
    str[i]="";
   }
   a--;
  }
 }

 public static void y(int a){
  if(buffer.equals("\n")) {
  str2=str[line].substring(0,loc);
  str3=str[line].substring(loc);
   for(int i=a-1;i>line;i--){
    str[i+1]="";
    str[i+1]+=str[i];
   }
   str[line]="";
   str[line]+=str2;
   str[line+1]="";
   str[line+1]+=str3;
   a++;
   loc=0;
   line++;
  }
  else if(buffer!="") {
   str2=str[line].substring(0,loc);
   str3=str[line].substring(loc);
   str[line]="";
   str[line]=str2+buffer+str3;
   loc+=buffer.length();
  }
 }
}

