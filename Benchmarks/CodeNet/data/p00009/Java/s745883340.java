public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] eratos;
    int i, j, pcount;

    pcount = 0;
    eratos = new int[999999];
    eratos[0] = pcount;
    for(i = 2;i < 1001;i++){
      if(eratos[i - 1] == 0){
        pcount++;
        for(j = i * i;j < 1000000;j+=i){
          eratos[j - 1] = -1;
        }
      }
      eratos[i - 1] = pcount;
    }
    for(;i < 1000000;i++){
      if(eratos[i - 1] == 0)pcount++;
      eratos[i - 1] = pcount;
    }

    for(;sc.hasNext();){
      n = sc.nextInt();
      System.out.println(eratos[n - 1]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}