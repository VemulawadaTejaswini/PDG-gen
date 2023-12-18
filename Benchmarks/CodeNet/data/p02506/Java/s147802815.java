import java.util.*;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String p=s.next();
p=p.toLowerCase();
int ret=0;
String now;
while(!((now=s.next()).equals("END_OF_TEXT
")))if(now.toLowerCase().equals(p))ret++;
System.out.println(ret);
}}