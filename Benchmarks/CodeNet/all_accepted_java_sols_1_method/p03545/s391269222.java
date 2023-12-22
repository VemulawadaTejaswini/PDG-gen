
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int[] bcd=new int[3];
    int t=a;
    for(int i=2;i>=0;i--){
      bcd[i]=t%10;
      t=t/10;
    }
    a=t%10;
    for(int i=0;i< 1<<3;i++){
      int sum=a;
      String[] pm=new String[3];
      for(int j=0;j<3;j++){
        if((1&(i>>j))==1){
          sum=sum-bcd[j];
          pm[j]="-";
        }
        else{
          sum=sum+bcd[j];
          pm[j]="+";
        }
      }
      if(sum==7){
        System.out.print(a);
        for(int j=0;j<3;j++){
          System.out.print(pm[j]+bcd[j]);
        }
        System.out.println("=7");
        break;
      }
    }
    sc.close();
  }
}
