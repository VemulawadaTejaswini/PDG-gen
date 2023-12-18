public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a, p, max;
    int i, j, res;

    n = sc.nextInt();
    a = new int[n];
    p = new int[32];
    max = new int[32];
    for(i = 0;i < n;i++)a[i] = sc.nextInt();

    for(i = 0;i < n;i++){
      for(j = 0;j < 32;j++)p[j] = 0;
      for(;a[i] != 1;){
        for(j = 2;j * j <= a[i];j++){
          if(a[i] % j == 0){
            p[j]++;
            a[i] = a[i] / j;
            break;
          }
        }
        if(j * j > a[i]){
          p[a[i]]++;
          break;
        }
      }
      for(j = 2;j < 32;j++)if(max[j] < p[j])max[j] = p[j];
    }
    res = 1;
    for(i = 2;i < 32;i++)if(isprime(i))for(j = 0;j < max[i];j++)res *= i;
    System.out.println(res);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static boolean isprime(int p){
    int i;
    if(p == 1)return false;
    for(i = 2;i * i <= p;i++){
      if(p % i == 0)return false;
    }
    return true;
  }
}