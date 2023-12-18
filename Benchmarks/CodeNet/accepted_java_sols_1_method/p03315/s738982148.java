import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String S=sc.next();
int a=0;
for(int i=0;i<4;i++){
if(S.charAt(i)=='+')a++;
if(S.charAt(i)=='-')a--;
}
System.out.println(a);
}
}