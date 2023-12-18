import java.util.*;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    for (int i=0; i<N; i++) {
      int num = sc.nextInt();
      count += ((i+1)%2 != 0 && num%2 != 0)?1 : 0;
    }
    System.out.println(count);
  }
}