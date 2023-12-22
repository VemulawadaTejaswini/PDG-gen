import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int en500 = sc.nextInt();
    int en100 = sc.nextInt();
    int en50  = sc.nextInt();
    int sum   = sc.nextInt();
    
    for(int i=0; i<=en500; i++){
      for(int j=0; j<=en100; j++){
        for(int k=0; k<=en50; k++){
          if((i*500 + j*100 + k*50) == sum){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}