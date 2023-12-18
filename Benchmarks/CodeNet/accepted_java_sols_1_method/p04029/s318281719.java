import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int c = 0;
    for(int i = 1;i <= N;i++){
      c+=i;
    }
  System.out.println(c);
  }
}