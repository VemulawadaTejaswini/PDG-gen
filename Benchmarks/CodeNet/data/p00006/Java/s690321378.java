import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String str=sc.next();
char[] c=new char[str.length()];
for(int i=0;i<str.length();i++){
c[i]=str.charAt(i);
}
for(int i=str.length()-1;i>=0;i--){
System.out.print(c[i]);
}
System.out.print("\n");
}
}