import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    sc.close();
    int start = (X-K+1);
    for (int i=start;i<=X+K-1;i++){
      if (i<X+K-1){
        System.out.print(i + " ");
      }else{
        System.out.println(i);
      }
    }
  }
}