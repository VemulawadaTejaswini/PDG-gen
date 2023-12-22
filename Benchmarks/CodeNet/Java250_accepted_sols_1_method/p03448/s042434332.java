import java.util.*;
public class Main{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int ans=0;
  int n=sc.nextInt();int m=sc.nextInt();int a=sc.nextInt();int b=sc.nextInt();
  for(int i=0;i<=n;i++){
  for(int j=0;j<=m;j++){
  for(int k=0;k<=a;k++){
  if(i*500+j*100+k*50==b)ans++;
  }
  }
  }
  System.out.println(ans);
}

}