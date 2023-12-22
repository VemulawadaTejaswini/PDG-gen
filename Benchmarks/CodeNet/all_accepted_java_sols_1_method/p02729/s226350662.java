import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int answer =0;
    if(N>=2){
      answer = answer + N*(N-1)/2;
    }
    if(M>=2){
      answer = answer + M*(M-1)/2;
    }
    System.out.println(answer);
  }
  

  
}