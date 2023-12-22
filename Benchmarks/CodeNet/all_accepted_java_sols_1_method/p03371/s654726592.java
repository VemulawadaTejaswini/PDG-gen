import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();  //Aの個数
    int Y = sc.nextInt();  //Bの個数
    int MAX = Math.max(X,Y);
    int MIN = Math.min(X,Y);
    int diff = MAX - MIN;
    int result = 0;

    if(MAX == X){
      result += Math.min((diff * A) , (diff * C * 2));
    
    }else{
      result += Math.min((diff * B) , (diff * C * 2));
    }
    
    if((C * (MIN * 2)) > ((A * MIN) + (B * MIN))){
      result += (A * MIN) + (B * MIN);
      
    }else{
      result += C * (MIN * 2);
    }
    
    System.out.println(result);
  }
}
