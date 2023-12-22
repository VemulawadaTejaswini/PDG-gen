import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      //入力
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] h = new int[n];
      //System.out.println(n);
      //System.out.println(k);
      for(int i=0;i<n;i++) {
        h[i] = sc.nextInt();
      }
      //for(int i=0;i<n;i++) {
        //System.out.println(h[i]);
      //}
      
      //計算
      int rideNumber = 0;
      for(int i=0;i<n;i++) {
        if(h[i]>=k) {
          rideNumber += 1;
        }
        //System.out.println(rideNumber);
      }
      
      //出力
      System.out.println(rideNumber);
      
    }
      
}

