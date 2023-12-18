import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] ans_array = new int[N + 1];
    int cnt = 0;
    for(int x = 1; x <= 100; x++){
      for(int y = 1; y <= x; y++){
        for(int z = 1; z <= y; z++){
          int tmp = (x * x) + (y * y) + (z * z) + (x * y) + (x * z) + (y * z);
          if(tmp <= N){
            if(x == y && y == z){
              ans_array[tmp]++;
            } else if(x == y || y == z || x == z){
              ans_array[tmp] += 3;
            } else {
              ans_array[tmp] += 6;
            }
          } else {
            break;
          }
        }
      }

    }
    for(int i = 1; i <= N; i++){
      System.out.println(ans_array[i]);
    }
  }
}
