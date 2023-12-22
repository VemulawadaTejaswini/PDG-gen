import java.util.Scanner;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  String s=sc.next();
  String t=sc.next();
  int i; int count=0;
  for(i=0;i<s.length();i++){
  if(s.charAt(i)!=t.charAt(i)){
  	count++;
  	}
  }
  System.out.println(count);
}
}