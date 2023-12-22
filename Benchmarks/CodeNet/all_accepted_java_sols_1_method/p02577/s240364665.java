import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  char c[]=sc.next().toCharArray();
  int ans=0;
  for(int i=0;i<c.length;i++){
    ans+=(c[i]-'0');
  }System.out.println(ans%9==0?"Yes":"No");
}
}