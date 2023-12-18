import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;
    for(int a=1;a<=n;a++){
      int b=n-a;
      if(b>=1){
        int sum=0,num;
        for(int i=0;i<2;i++){
          if(i==0) num=a;
          else num=b;
          while(num>0){
            sum+=num%10;
            num/=10;
          }
        }
        if(sum<min) min=sum;
      }
    }
    System.out.println(min);
  }
}