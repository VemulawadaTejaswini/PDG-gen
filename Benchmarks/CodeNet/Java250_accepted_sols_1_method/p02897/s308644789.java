import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int n = 0;
    if(1<=a && a<=100){
      for(int i = 1;i<=a;i++){
        if(i%2!=0){
          n = n + 1;
        }
      }
      double m = (double)n/(double)a;
      System.out.println(m);
    }
  }
}

