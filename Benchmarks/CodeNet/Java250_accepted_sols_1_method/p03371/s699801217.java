import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    int set_AB = 0;
    if(A+B>=C*2){
      set_AB = C*2;
    }else{
      set_AB = A+B;
    }
    int common = Math.min(X,Y);
    int max = Math.max(X,Y);
    
    int last_price = 0;
    if(X>=Y){
      last_price = A;
    }else{
      last_price = B;
    }
    
    int last = max-common;//残りの枚数、値段は枚数が多いほう
    int extra = 0;
    if(last_price>=C*2){
       extra = C*2*last;
      }else{
       extra = last_price*last;
      }
   
    int charge = set_AB*common+extra;
    System.out.println(charge);
  }
}