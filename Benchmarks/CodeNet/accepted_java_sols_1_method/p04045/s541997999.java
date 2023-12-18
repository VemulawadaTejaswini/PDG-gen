import java.util.*;
public class Main{
public static void main(String[]a){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int s[]=new int[m];
for(int i=0;i<m;i++)s[i]=sc.nextInt();
boolean check=false;
while(!check){
check=true;
String p=n+"";
String ss[]=p.split("",0);
for(int i=0;i<ss.length;i++){
for(int j=0;j<m;j++){
if(ss[i].equals(s[j]+"")){n++;check=false;break;}
}if(!check){break;}
}}
System.out.println(n);

}
}