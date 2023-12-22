import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] input = new int[5];
    input[0] = sc.nextInt();
    input[1] = sc.nextInt();
    input[2] = sc.nextInt();
    input[3] = sc.nextInt();
    input[4] = sc.nextInt();
    int lastIdx = 0;
    int answer = 0;
    for (int i = 1; i < 5; i++){
        if (input[i] % 10 != 0 && input[lastIdx] % 10 > input[i] % 10) {
            lastIdx = i;
        }
    }
    for (int i = 0; i < 5; i++){
        if (i != lastIdx) {
            answer += floor(input[i],10);
        }
    }
    answer += input[lastIdx];
    System.out.println(answer);

  }
  
  private static int floor(int src, int unit){
      if ((src % unit) == 0) {
          return src;
      } else {
          return ((src / unit) + 1) * unit;
      }
  }
}
