import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int k=0;
    int s=0;
    int s1;
    int s2;
    int k1;
    int k2;
    int ans=0;

    if(a>b){
      k=a;
      s=b;
    }else{
      k=b;
      s=a;
    }
    for(int i=s;i<k;i++){
      s1=a-i;
      s2=i-a;
      k1=b-i;
      k2=i-b;
      if(s1==k1){
        System.out.println(i);
        ans=1;
      }else if(s1==k2){
        System.out.println(i);
        ans=1;
      }else if(s2==k1){
        System.out.println(i);
        ans=1;
      }else if(s2==k2){
        System.out.println(i);
        ans=1;
      }
    }
    if(ans!=1){
      System.out.println("IMPOSSIBLE");
    }

  }
}
