import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a, max, sum;
    max = sc.nextInt();
    sum = 0;
    for(int i = 1; i < N; i++){
      a = sc.nextInt();
      if(max<=a){
        max = a;
      } else {
        sum += max - a;
      }
    }
    System.out.println(sum);
  }
}
