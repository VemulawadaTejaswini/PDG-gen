import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int f=0;
    int t=0;
    int o=0;
    for(int i=0;i<n;i++){
      int in=sc.nextInt();
      if(in%4==0){
        f++;
      }else if(in%2==0){
        t++;
      }else{
        o++;
      }
    }
    if(t>0){
      if(f>=o){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      if(f>=o-1){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}