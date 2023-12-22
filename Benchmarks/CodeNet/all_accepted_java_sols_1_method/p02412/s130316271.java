import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n=sc.nextInt();
      int x=sc.nextInt();
      if(n==0&&x==0) break;
      int count=0;
      for(int i=n;0<i;i--){
        for(int j=n;0<j&&j!=i;j--){
          for(int k=n;0<j&&k!=i&&k!=j;k--){
            if(i+j+k==x) count+=1;
          }
        }
      }
      System.out.println(count);
    }
    sc.close();
  }
}
