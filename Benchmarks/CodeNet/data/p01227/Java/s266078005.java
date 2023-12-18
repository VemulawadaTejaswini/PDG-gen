public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int t, n, k;
    int i, j, l, joint, sum, min, dmin;
    int[] x;
    int[] d;

    x = new int[100000];
    d = new int[100000];

    t = sc.nextInt();
    for(i = 0;i < t;i++){
      n = sc.nextInt();
      k = sc.nextInt();

      if(n <= k){
        for(j = 0;j < n;j++){
          k = sc.nextInt();
        }
        System.out.println(0);
      }else{
        joint = n - k;
        sum = 0;

//input
        for(j = 0;j < n;j++){
          if(j > 0){
            x[j] = sc.nextInt();
            d[j - 1] = x[j] - x[j - 1]; //distance
          }else{
            x[j] = sc.nextInt();
          }
        }

//cal
        for(j = 0;j < joint + 1;j++){
          dmin = 1000000;
          min = -1;
          for(l = 0;l < n;l++){
            if(dmin > d[l]){
              dmin = d[l];
              min = l;
            }
          }
          sum += dmin;
          if(min != -1){
            d[min] = 1000000;
          }  
        }
        System.out.println(sum);
      }
    }
/*end*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}