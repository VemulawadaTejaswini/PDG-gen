import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //机Aの冊数
    int n = sc.nextInt();
    //机Bの冊数
    int m = sc.nextInt();
    //最大の時間数
    int k = sc.nextInt();
    
    
    //Aの本
    int[] bookA = new int[n];
    for(int i = 0; i < n;i++){
      bookA[i] = sc.nextInt();
    }
    //Aのトータル
    int totalA = 0;
    for(int i = 0;i < n;i++){
      totalA += bookA[i];
    }
    
    //Bの本
    int[] bookB = new int[m];
    for(int i = 0; i < m;i++){
      bookB[i] = sc.nextInt();
    }
    
    //Bのトータル
    int totalB = 0;
    for(int i = 0; i < m;i++){
      totalB += bookB[i];
    }
    
    if(totalA + totalB <= k){
      System.out.println(m + n);
      return;
    }
    
    //Aのカウンタ
    int countA = 0;
    //Bのカウンタ
    int countB = 0;
    
    //冊数のカウント
    int c = 0;
    
    //トータル
    int total = 0;
    while(true){
      if(bookA[countA] <= bookB[countB]){
        total += bookA[countA];
        countA++;
        c++;
      }else if(bookA[countA] > bookB[countB]){
        total += bookB[countB];
        countB++;
        c++;
      }
      if(total >= k){
        System.out.print(c - 1);
        break;
      }
    }
    
  }
}