import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int M = scanner.nextInt();
      int a =0;
      for(int i=0; i<M; i++){ 
        a +=scanner.nextInt();
      }
      if(N<a){
      System.out.println("-1");
      }
      else{
      System.out.println(N-a);
    }
    }
 }