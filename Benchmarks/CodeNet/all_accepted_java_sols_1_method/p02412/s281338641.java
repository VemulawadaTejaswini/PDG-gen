// ITP1_7_B
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    // Configuration
    Scanner scanner = new Scanner(System.in);

    // Cacl roop
    while(true){
      // Input
      String[] row = scanner.nextLine().split(" ");
      int n = Integer.parseInt(row[0]);
      int x = Integer.parseInt(row[1]);
      // Stop condition
      if(n==0 && x==0){
        break;
      }

      // Calculation
      int answer = 0;
      for(int i=1; i<=n-2; i++){
        for(int j=i+1; j<=n-1; j++){
          int tmp = i + j;
          int k = x - tmp;

          if(k<=i || k<=j){
            continue;
          }

          if(k>=1 && k<=n){
            answer += 1;
          }
        }
      }
      // Output
      System.out.println(answer);
    }
  }
}

