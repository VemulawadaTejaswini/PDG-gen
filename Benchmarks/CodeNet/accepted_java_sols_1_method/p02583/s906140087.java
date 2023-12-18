import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);

      int n = scan.nextInt();
      int ls[] = new int[n];
      for(int i = 0;i < n;i++)
        ls[i] = scan.nextInt();
      Arrays.sort(ls);

      int ans = 0;
      for(int i = 0;i < n;i++){
          for(int j = 0;j < i;j++){
              for(int k = 0;k < j;k++){
                //全てが異なる
                if(ls[k] != ls[j] && ls[i] != ls[j])
                    //三角形の成立条件(ソート済みに限り)
                    if(ls[k] + ls[j] > ls[i]){
                        ans++;
                    }
              }
          }
      }

      System.out.println(ans);
    }
}