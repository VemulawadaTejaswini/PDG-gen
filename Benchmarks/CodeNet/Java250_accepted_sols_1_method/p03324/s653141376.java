import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt(),
        n = sc.nextInt();
    if(d == 0){
      if(n == 100)
        System.out.println(n + 1);
      else
        System.out.println(n);
    }
    else{
      int p = 1;
      for(int j = 0; j < d; j++)
        p *= 100;
      if(n == 100)
        System.out.println(p * n + p);
      else
        System.out.println(p * n);
      
    }
  }
}