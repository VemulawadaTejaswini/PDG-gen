import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      //入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] score = new int[100010];
        int q = sc.nextInt();
        for (int i=0;i<n;i++) {
           score[i] = k-q;
        }
        //int[] array = new int[100010];
        for (int i=0;i<q;i++) {
           score[sc.nextInt()-1] ++;
        }
      //ラウンド
      //  for (int i=0;i<q;i++) {
       //   for (int j=0;j<n;j++) {
         //   if(j==array[i]-1) score[j] = score[j];
           // else score[j] --;
          //}
        //}
      
      //発表
        for (int i=0;i<n;i++) {
          if(score[i]>0) System.out.println("Yes");
          else System.out.println("No");
        }
    }
}

