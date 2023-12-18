public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, i;

    for(;sc.hasNext();){
      n = sc.nextInt();
      for(i = n - 1;;i--)if(isprime(i)){
        out.print(i + " "); break;
      }
      for(i = n + 1;;i++)if(isprime(i)){
        out.println(i); break;
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static boolean isprime(int p){
    int i;
    if(p == 1)return false;
    else for(i = 2;i * i <= p;i++)if(p % i == 0)return false;
    return true;
  }
}