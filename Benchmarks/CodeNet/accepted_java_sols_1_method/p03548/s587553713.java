import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int answer =0;
    //端からどん欲に座らせていく、椅子の残りがY+2Z未満になったら終わり
    while(X>=Y+2*Z){
      answer = answer +1;
      X=X-Z-Y;
    }
    System.out.println(answer);
      
  }
  

  
}