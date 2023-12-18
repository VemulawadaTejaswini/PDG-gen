import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String s=sc.next();
  char[] c=s.toCharArray();
  int i=0,j=n-1;
  int count=0;
  while(i<=j){
if(c[i]=='W'&&c[j]=='R'){
   char temp=c[i];
   c[i]=c[j];
   c[j]=temp;
   i++;j--;
   count++;
   }else if(c[i]=='R'&&c[j]=='R'){
i++;
   }else{
j--;
   }
   }
   System.out.println(count);
   }
   }
   