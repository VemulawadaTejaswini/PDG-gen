public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a;
    int[] check;
    int i, sum;

    check = new int[10];
    for(;sc.hasNext();){
      for(i = 0;i < 10;i++)check[i] = 0;
      sum = 0;
      a = sc.nextInt();
      sum += a;
      for(i = 0;i < 10;i++)if(a == i + 1)check[a - 1]++;
      a = sc.nextInt();
      sum += a;
      for(i = 0;i < 10;i++)if(a == i + 1)check[a - 1]++;
      a = sc.nextInt();
      for(i = 0;i < 10;i++)if(a == i + 1)check[a - 1]++;
      a = 0;
      for(i = 0;i < 10;i++)if(i + 1 <= 20 - sum && check[i] == 0)a++;
      if(a > 3)out.println("YES");
      else out.println("NO");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}