import java.util.*;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
String S = sc.next();
int d=1000;
for(int i=0;i<=S.length()-3;i++){
  String result = S.substring(i,i+3);
  if(Math.abs(Integer.parseInt(result)-753)<d){
    d = Math.abs(Integer.parseInt(result)-753);
  }
}
System.out.println(d);
}
}
