public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int count, i;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      count = 0;

      for(i = 2;(i * (i + 1) / 2) < 1000;i++){
        if(i % 2 == 0){
          if(n >= (i * (i + 1) / 2) && n % i == (i / 2))count++;
        }else{
          if(n >= (i * (i + 1) / 2) && n % i == 0)count++;
        }
      }
      out.println(count);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}