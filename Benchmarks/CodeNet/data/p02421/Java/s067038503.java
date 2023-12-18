public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String ts, hs;
    int n, tm, hm, tsum, hsum;
    char[] tc, hc;
    int i, j;

    n = sc.nextInt();
    tsum = 0;
    hsum = 0;

    for(i = 0;i < n;i++){
      ts = sc.next();
      hs = sc.next();
      if(ts.equals(hs)){
        tsum++;
        hsum++;
      }else{
        tm = ts.length();
        hm = hs.length();
        tc = new char[tm];
        hc = new char[hm];
        for(j = 0;j < tm;j++){
          tc[j] = ts.charAt(j);
        }
        for(j = 0;j < hm;j++){
          hc[j] = hs.charAt(j);
        }

        if(tm >= hm){
          for(j = 0;j < hm;j++){
            if(tc[j] > hc[j]){
              tsum += 3;
              break;
            }else if(hc[j] > tc[j]){
              hsum += 3;
              break;
            }
            if(j + 1 == hm){
              tsum += 3;
            }
          }
        }else{
          for(j = 0;j < tm;j++){
            if(tc[j] > hc[j]){
              tsum += 3;
              break;
            }else if(hc[j] > tc[j]){
              hsum += 3;
              break;
            }
            if(j + 1 == tm){
              hsum += 3;
            }
          }
        }
      }
    }

    System.out.println(tsum + " " + hsum);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}