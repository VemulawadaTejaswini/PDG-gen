public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, t, i, j, t1, t2, count;
    String stt, stn, art, arn;
    char[] sttc, artc;
    int[] lis;
    String[] liss;

    n = sc.nextInt(); t = sc.nextInt();
    lis = new int[n]; liss = new String[n];
    count = 0;
    stt = sc.next(); stt = sc.next();
    for(i = 0;i < n - 1;i++){
      stt = sc.next(); stn = sc.next(); art = sc.next(); arn = sc.next();
      sttc = new char[stt.length()]; artc = new char[art.length()];
      for(j = 0;j < stt.length();j++)sttc[j] = stt.charAt(j);
      for(j = 0;j < art.length();j++)artc[j] = art.charAt(j);
      t1 = readint(sttc, 0, 2) * 60 + readint(sttc, 3, 5);
      t2 = readint(artc, 0, 2) * 60 + readint(artc, 3, 5);
      if(t2 - t1 >= t){
        liss[count] = stn; lis[count++] = t2 - t1;
      }
    }
    out.println(count);
    for(i = 0;i < count;i++)out.println(liss[i] + " " + lis[i]);

    sc.close();
  }
  private static int readint(char[] ch, int l, int r){
    int i, d, res, s;
    d = 1; res = 0; s = 1;
    if(ch[l] == '-'){ s = -1; l++; }
    for(i = r - 1;i >= l;i--){
      res += d * (int)(ch[i] - '0');
      d *= 10;
    }
    return res * s;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}