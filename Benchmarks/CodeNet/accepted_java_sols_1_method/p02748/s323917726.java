import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int M = sc.nextInt();
      
      int arrayA[] = new int[A];
      for(int i = 0; i < A; i++){
        arrayA[i] = sc.nextInt();
      }
      
      int arrayB[] = new int[B];
      for(int i = 0; i < B; i++){
        arrayB[i] = sc.nextInt();
      }
      
      int arrayX[] = new int[M];
      int arrayY[] = new int[M];
      int arrayC[] = new int[M];
      for(int i = 0; i < M; i++){
        arrayX[i] = sc.nextInt();
        arrayY[i] = sc.nextInt();
        arrayC[i] = sc.nextInt();
      }
      
      // 割引券未使用時の最小金額
      int minA = Integer.MAX_VALUE;
      int minB = Integer.MAX_VALUE;
      for(int i = 0; i < A; i++){
        int price = arrayA[i];
        if(price < minA){
          minA = price;
        }
      }
      
      for(int i = 0; i < B; i++){
        int price = arrayB[i];
        if(price < minB){
          minB = price;
        }
      }
      
      int min = minA + minB;
      
      // 割引券使用時の最小金額
      for(int i = 0; i < M; i++){
        int price = arrayA[arrayX[i]-1] + arrayB[arrayY[i]-1] - arrayC[i];
        if(price < min){
          min = price;
        }
      }
      
      // 出力
      System.out.println(min);
    }

}