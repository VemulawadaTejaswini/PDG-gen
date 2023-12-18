import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    StringBuilder ans =  new StringBuilder();
    while(N > 0){
      N--;
      ans.append((char) (N % 26 + 'a'));
      N /= 26;
    }
    System.out.println(ans.reverse());
  }
}