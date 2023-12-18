public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      for(i = n;;i--)if(isprime(i))break;
      for(j = n;;j++)if(isprime(j))break;
      out.println(j - i);
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