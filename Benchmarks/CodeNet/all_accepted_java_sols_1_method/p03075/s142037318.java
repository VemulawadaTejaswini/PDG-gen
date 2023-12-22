import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,c,d,e,k,temp;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();
    k=sc.nextInt();
      if(a-b>0){
        temp=a;
        a=b;
        b=temp;
      }
      if(a-c>0){
        temp=a;
        a=b;
        b=temp;
      }if(a-d>0){
        temp=a;
        a=b;
        b=temp;
      }if(a-e>0){
        temp=a;
        a=b;
        b=temp;
      }

      if(e-b<0){
        temp=e;
        e=b;
        b=temp;
      }if(e-c<0){
        temp=e;
        e=b;
        b=temp;
      }if(e-d<0){
        temp=e;
        e=b;
        b=temp;
      }
    if(e-a<=k){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }
  }
}
