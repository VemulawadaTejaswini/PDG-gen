import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  String s=sc.next();
  int l=s.length();
  char prev=s.charAt(0);
  char nex='Z';
  int cnt=0;
  for(int i=1;i<l;i++){
    nex=s.charAt(i);
    if(prev!=nex){
      cnt++;
    }
    prev=nex;
  }
  System.out.println(cnt);   
}
}