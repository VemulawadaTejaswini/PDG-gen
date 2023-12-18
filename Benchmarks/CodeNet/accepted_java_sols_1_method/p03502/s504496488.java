import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int digitSum = 0;
    int num = N;
    while( num > 0){
      digitSum += num%10;
      num /= 10;
    }
    if( N % digitSum == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
  }
  }
}

    