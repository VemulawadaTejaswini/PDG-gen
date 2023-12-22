import java.util.*;
public class Main{
  public static void main(String[] args){
    try{
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int M = scanner.nextInt();
      int[][] cities =new int[N][N];
      int i = 0;
      int j = 0;
      int sum = 0;

      for(i=0;i<N;i++){
        for(j=0;j<N;j++){
          cities[i][j]=0;
        }
      }

      for(i=0;i<M;i++){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        cities[a-1][b-1]++;
        cities[b-1][a-1]++;
      }
      for(i=0;i<N;i++){
        sum = 0;
        for(j=0;j<N;j++){
          sum+=cities[i][j];
        }
        System.out.println(sum);
      }
      scanner.close();
    }catch(Exception e){
      System.out.println("何か入力してください");
    }
  }
}
