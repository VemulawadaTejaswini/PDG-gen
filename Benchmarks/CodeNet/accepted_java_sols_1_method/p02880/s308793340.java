import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int l=1;
    int h=N;
    int l_tmp=1;
    int h_tmp=N;
    while(h-l>1){
      if(l*h<N){
        while(l*h<N){
          l++;
        }
      }
      if(l*h>N){
        while(l*h>N){
          h--;
        }
      }
      if(l*h==N){
        l_tmp=l;
        h_tmp=h;
        l++;
        h--;
      }
    }
  
    if(l_tmp<=9&&h_tmp<=9){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}