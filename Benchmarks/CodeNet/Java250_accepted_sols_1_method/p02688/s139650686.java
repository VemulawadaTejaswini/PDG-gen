import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    
    int N = scan.nextInt();
    int K = scan.nextInt();
    
    int sunuke[] = new int[N];
    int num;
    
    for(int k = 0; k < K; k++){
      num = scan.nextInt();
      for(int n = 0; n < num; n++){
        if(sunuke[scan.nextInt()-1]++ == 0){
          N--;
        }
      }
    }
    
    System.out.println(N);
  }
}