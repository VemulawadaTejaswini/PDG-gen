import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] A = new int[5];
    for(int i=0; i<5; i++){
      A[i] = scanner.nextInt();
    }

    int ans = 0;

    for(int i=0; i<5; i++){
        if(A[i] == 0){
            ans = i + 1;
        }
      }
    System.out.println(ans);
    scanner.close();
    return;

  }
}