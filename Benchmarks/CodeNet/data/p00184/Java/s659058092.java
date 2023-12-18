public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] a, count;
    int i, j, n;

    count = new int[7];
    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      a = new int[n];
      for(i = 0;i < n;i++)a[i] = sc.nextInt();
      for(i = 0;i < 7;i++)count[i] = 0;
      for(i = 0;i < n;i++){
        for(j = 10;j < 70;j+=10)if(a[i] < j){
          count[j / 10 - 1]++; break;
        }
        if(j == 70)count[j / 10 - 1]++;
      }
      for(i = 0;i < 7;i++)out.println(count[i]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}