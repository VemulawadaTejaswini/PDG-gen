import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x[] = new int[n];

    for(int i = 0; i < n; i ++){
      x[i] = scan.nextInt();
    }

    String answer = "APPROVED";

    for(int i = 0; i < n; i ++){
      if(x[i] % 2 ==0){
        if(x[i] % 3 != 0 && x[i] % 5 != 0){
          answer = "DENIED";
        }
      }
    }
    System.out.println(answer);
    }
  }