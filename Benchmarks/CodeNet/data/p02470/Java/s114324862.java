public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] p;
    int i, j, res;

    n = sc.nextInt();
    p = new int[30];
    j = 0;
    res = n;

    for(;n != 1;){
      for(i = 2;i * i <= n;i++){
        if(n % i == 0){
          p[j] = i;
          if(j > 0 && p[j] == p[j - 1]){
          }else j++;
          n = n / i;
          break;
        }
      }
      if(i * i > n){
        p[j] = n;
        if(j > 0 && p[j] == p[j - 1]){
        }else j++;
        break;
      }
    }

    for(i = 0;i < j;i++)res = res / p[i] * (p[i] - 1);
    
    out.println(res);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}