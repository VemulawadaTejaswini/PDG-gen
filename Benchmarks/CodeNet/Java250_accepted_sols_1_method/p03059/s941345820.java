import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int sum = 0;
    int ok = 0;
    for(int i = 0; i < 1000; i++){
      sum = a + sum;
      if(sum < (double)c+0.5){
        ok = ok + b;
      }else if(sum > (double)c+0.5){
        break;
      }
    }
    System.out.println(ok);
  }
}
