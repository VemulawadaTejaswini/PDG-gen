import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();

    int maxNum = Math.max( Math.max( A,B) , C );
    int reminder = A + B + C - maxNum ;

    for(int i =  0 ; i < K ;i ++){
      maxNum = maxNum * 2;
    }

    System.out.println( maxNum + reminder );

  }
}
