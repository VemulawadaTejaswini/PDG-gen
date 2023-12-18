public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int i, count;

    for(;sc.hasNextInt();){
      n = sc.nextInt();
      count = 0;
      for(i = 1;i <= n;i++)if(isprime(i) && isprime(n + 1 - i))count++;
      System.out.println(count);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static boolean isprime(int p){
    int i;
    if(p == 1)return false;
    for(i = 2;i * i <= p;i++)if(p % i == 0)return false;
    return true;
  }
}