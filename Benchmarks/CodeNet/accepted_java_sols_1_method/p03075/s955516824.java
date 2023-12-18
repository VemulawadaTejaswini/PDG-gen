import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
          list[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        String ans = "Yay!";
        for (int i = 0; i < 5; i++) {
          int value = list[i];
          for (int index = i + 1; index < 5; index++) {
            if (Math.abs(value - list[index]) > k) {
              ans = ":(";
              break;
            }
          }
        }
              
		// 出力
		System.out.println(ans);
	}
}