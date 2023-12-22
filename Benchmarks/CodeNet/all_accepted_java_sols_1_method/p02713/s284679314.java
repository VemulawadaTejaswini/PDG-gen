import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt(); //繰り返す回数
    int a;  //割られる数＿最大公約数
    int b;  //割る数
    int c;  //あまり
    int max;  //最大公約数
    int sum = 0;

    for(int i=1;i<=k;i++){
      for(int j=1;j<=k;j++){
        for(int l=1;l<=k;l++){
          if(i>j){
            a = i;
            b = j;
            c = 1;
          }else{
            a = j;
            b = i;
            c = 1;
          }       
          while(c!=0){
            c = a%b;
            a = b;
            b = c;
          }
          max = a;
          if(max>l){
            a = max;
            b = l;
            c = 1;
          }else{
            a = l;
            b = max;
            c = 1;
          }       
          while(c!=0){
            c = a%b;
            a = b;
            b = c;
          }
          max = a;
          sum = sum+max;
        }
      }
    }
    System.out.println(sum);
  }
}