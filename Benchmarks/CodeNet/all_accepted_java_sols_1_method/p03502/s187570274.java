import java.util.*;
public class Main{public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String po=n+"";
  String s[]=po.split("",0);
  int ans=0;
  for(int i=0;i<s.length;i++)ans+=Integer.parseInt(s[i]);
  System.out.println((n%ans==0)?"Yes":"No");
}}
