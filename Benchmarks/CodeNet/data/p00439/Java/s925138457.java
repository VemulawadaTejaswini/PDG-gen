public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, k, i, j, max, sum;
    int[] a;
    for(;;out.println(max)){
      n = sc.nextInt(); k = sc.nextInt();
      if(n == 0 && k == 0)break;
      max = -k * 10001;
      a = new int[n];
      for(i = 0;i < n;i++)a[i] = sc.nextInt();
      sum = 0;
      for(i = 0;i < k;i++)sum += a[i];
      max = sum;
      for(i = 0;i < n - k;i++){
        sum += (a[i + k] - a[i]);
        if(max < sum)max = sum;
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}