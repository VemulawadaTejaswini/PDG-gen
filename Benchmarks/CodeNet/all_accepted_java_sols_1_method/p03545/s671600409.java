import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int abcd = sc.nextInt();
    int a = abcd/1000;
    abcd -= a*1000;
    int b = abcd/100;
    abcd -= b*100;
    int c = abcd/10;
    int d = abcd - c*10;
    int i=0,j=0,k=0;
    ui:for(i = 0;i<2;i++){
      for(j = 0;j<2;j++){
        for(k = 0;k<2;k++){
          int bl = b;
          if(i==1){
            bl*=-1;
          }
          int cl = c;
          if(j==1){
            cl*=-1;
          }
          int dl = d;
          if(k==1){
            dl*=-1;
          }
          if(a+bl+cl+dl==7){
            break ui;
          }
        }
      }
    }
    System.out.print(a);
    if(i==0){
      System.out.print("+");
    }else{
      System.out.print("-");
    }
    System.out.print(b);
    if(j==0){
      System.out.print("+");
    }else{
      System.out.print("-");
    }
    System.out.print(c);
    if(k==0){
      System.out.print("+");
    }else{
      System.out.print("-");
    }
    System.out.println(d+"=7");
  }
}
