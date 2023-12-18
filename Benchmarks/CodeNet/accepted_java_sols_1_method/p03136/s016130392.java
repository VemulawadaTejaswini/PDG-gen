import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    int max = 0;
    for(int i = 0; i<N; i++){
      int tmp = sc.nextInt();
      sum += tmp;
      max = Math.max(tmp,max);
    }
    if(max<(sum - max)){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}