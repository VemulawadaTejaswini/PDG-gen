import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    int count = 0;
    for(int i = 0,min = n,p;i<n;i++){
      p = sc.nextInt();
      if(p<=min){
        count++;
        min = p;
      }
    }
    System.out.println(count);
  }
}
