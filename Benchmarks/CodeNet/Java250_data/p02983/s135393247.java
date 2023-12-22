import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    long l, r;
    Scanner scanner = new Scanner(System.in);
    l = scanner.nextInt();
    r = scanner.nextInt();
    
    if(r - l >= 2019){
      System.out.println(0);
    }else{
      long min = 2018;
      for(long i = l; i <= r - 1; i++){
        for(long j = i + 1; j <= r; j++){
          long ij = (i * j) % 2019;
          if(ij < min){
            min = ij;
          }
        }
      }
      System.out.println(min);
    }
  }
}
