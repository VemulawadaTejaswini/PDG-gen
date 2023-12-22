import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        
        int[] point;
        point = new int[n];
      
        for (int i = 0; i <n; i++) {
          point[i] = k;
        }
      
        for (int i = 0; i < q; i++) {
          int number = sc.nextInt();
          point[number - 1] = point[number - 1] + 1;
        }
        
      
        int border = q;
        for (int i = 0; i <n; i++) {
          if (point[i] > border) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }
        }
    }
}   