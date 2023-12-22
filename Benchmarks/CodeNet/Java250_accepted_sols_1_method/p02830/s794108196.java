import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String T = sc.next();
    String S = sc.next();
    String R ="";
    for(int i =0;i<N;i++){
      R+=T.substring(i,i+1) + S.substring(i,i+1);
    }
    System.out.println(R);
  }
}