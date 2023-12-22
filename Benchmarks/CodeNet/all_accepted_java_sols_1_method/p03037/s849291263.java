import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int under = 0;
    int top = Integer.MAX_VALUE;
    for(int i=0; i<M; i++){
      under = Math.max(sc.nextInt(),under);
      top = Math.min(sc.nextInt(),top);
    }
    int diff = top - under;
    int ans =diff + 1;
    System.out.print(((ans<0)?0:ans));
  }
}
    
