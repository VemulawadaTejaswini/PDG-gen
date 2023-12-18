import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int c = 1;
    int cnt = 0;
    
    for(int i=0; i<N; i++){
      cnt += c;
      c +=1;
    }
    System.out.println(cnt);
  }
}