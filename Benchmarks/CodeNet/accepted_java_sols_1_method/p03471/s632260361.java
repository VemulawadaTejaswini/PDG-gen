import java.util.*;
public class Main{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  int m=sc.nextInt();
  m/=1000;
  boolean b=false;
  for(int i=0;i<=n;i++){
  for(int j=0;j<=n-i;j++){
  	if(m==i*10+j*5+(n-i-j)){
    System.out.println(i+" "+j+" "+(n-i-j));
      b=true;
      break;
    }
  }
    if(b)break;
  }
  if(!b)System.out.println("-1 -1 -1");
}
}