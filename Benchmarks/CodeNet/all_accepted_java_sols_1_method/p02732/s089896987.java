import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    long[] numSumList = new long[n + 1];
    long all = 0;

    for(int i = 0 ; i < n ; i++){
      a[i] = sc.nextInt();
      numSumList[a[i]]++;
    }
      for(int i = 1 ; i <= n ; i++){
        long j = numSumList[i];
        all += j * (j - 1L) / 2L;
	}
      String s = "";
      StringBuilder sb = new StringBuilder(s);
      for(int i = 0 ; i < a.length ; i++){
        long k = numSumList[a[i]];
        sb.append(all - (k - 1) + "\n");
      }
      System.out.println(sb.toString());
    }
}
