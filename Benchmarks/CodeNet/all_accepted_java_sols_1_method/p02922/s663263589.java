import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int  a = sc.nextInt();
    int b=sc.nextInt();
    int N=0;
    while(1+N*(a-1)<b){
      N++;
    }
    System.out.println(N);
  }
}
