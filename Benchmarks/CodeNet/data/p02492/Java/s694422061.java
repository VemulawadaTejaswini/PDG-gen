import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  String op=sc.nextLine();
  if(op!="+"&&op!="-"&&op!="*"&&op!="/"){
  op="?";
  int ans;
  int b=sc.nextInt();
  if(op!="?"){
  if(op=="+") ans=a+b;
  else if(op=="-") ans=a-b;
  else if(op=="*") ans=a*b;
  else ans=a/b;
  System.out.println(ans);
  }else{
   
   }
  }
 }
}
 
  