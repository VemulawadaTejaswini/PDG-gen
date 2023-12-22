import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      //入力
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] h = new int[110000];
      for (int i=0; i<n; i++) h[i] = sc.nextInt();
      
      //移動
      int count;
      int max = 0;
      for(int start=0;start<n-1;start++) {
        if(max>=n-start) break;
        count = 0;
        for(int now=start;now<n-1;now++) {
          if(h[now]>=h[now+1]) count++;
          else break;
        }
        max = Math.max(max,count);
      }
      
      //出力
      System.out.println(max);
      
    }
      
}

