import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i+=2){
      int cou=1;
      for(int j=3;j<=i;j+=2){
        if(i%j==0)cou++;
      }
      if(cou==8)count++;
    }
    System.out.println(count);
  }
}