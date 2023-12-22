import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int X = sc.nextInt();
    for(int i=0; i<K-1; i++){
      System.out.print(X-K+1+i +" ");
    }
    for(int i=0; i<K-1; i++){
      System.out.print(X+i +" ");
    }
    System.out.println(X+K-1);
  }
}
