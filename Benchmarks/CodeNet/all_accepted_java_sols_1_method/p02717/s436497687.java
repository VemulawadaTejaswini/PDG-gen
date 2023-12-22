import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    
    //AとBを入れ替える
    int S;
    S = X;
    X = Y;
    Y = S;
    //AとCを入れ替える
    int T;
    T = X;
    X = Z;
    Z = T;
    System.out.println(X + " " + Y + " " + Z);
    
  }
}