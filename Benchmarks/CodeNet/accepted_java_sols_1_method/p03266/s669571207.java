import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    long c = 0;
    long g = 0;
      for(int i = 1; i <= N; i++){
        if(i%K==0){
          c++;
        }else if(K%2==0 && i%K==K/2){
          g++;
        }
      }
    System.out.println(c*c*c+g*g*g);
  }
}