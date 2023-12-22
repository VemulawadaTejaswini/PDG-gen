import java.util.*;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
  int n=s.nextInt();
 int tako[]=new int[n];
  for(int i=0;i<n;i++){
  tako[i]=s.nextInt();
  }
  int cnt=0;
 r: for(int i=n-1;i>-1;i--){
  for(int k=i-1;k>-1;k--){
    if(i<=0)
      break r;
  cnt+=tako[i]*tako[k];
  }
  }
  System.out.println(cnt);
}
}