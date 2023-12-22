import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a];
    int sum = 0; 
    int ans = 0;
    for(int i = 0;i < b.length;i++){
      b[i] = sc.nextInt();
      sum += b[i];
    }
    for(int j = 1;j < b.length;j++){
      int half = 0;
      int tmp = 0;
      for(int x = 0;x < j;x++){
        half += b[x];
        tmp = sum - (half * 2);
        tmp = Math.abs(tmp);
        if(x == 0 ||tmp < ans){
          ans = tmp;
        }
      }
    }
    System.out.println(ans);
  }
}