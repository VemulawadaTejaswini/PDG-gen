import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
  //  int[] arr = new int[n];
    int c =0;
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      if(c+1==a){
        c++;
      }
    }
    if(c==0){
      System.out.println("-1");
    }
    else{
      System.out.println(n-c);
    }
  }
}