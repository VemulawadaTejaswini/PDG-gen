import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int count = 0;
    while(count != 1){
      count = 0;
      for(int i = 2;i<=x;i++){
        if(x%i==0)count++;
      }
      x++;
    }
    x--;
    System.out.println(x);
  }
}
