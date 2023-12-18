public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int sum, ave, n, x, y, i, j, k;
    String str;
    char[] ch;

    sum = 0; ave = 0; n = 0;
    for(;sc.hasNext();){
      str = sc.next();
      ch = new char[str.length()];
      for(j = 0;j < str.length();j++)ch[j] = str.charAt(j);
      x = 0; y = 0; k = 0;

      for(j = 0;j < str.length();j++){
        if(ch[j] == ','){
          x = readint(ch, 0, j);
          k = ++j; break;
        }
      }
      y = readint(ch, k, str.length());

      sum += x * y; ave += y; n++;
    }

    out.println(sum); out.println((int)(0.5 + ((double)ave / (double)n)));

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int readint(char[] ch, int l, int r){
    int i, d, res;
    d = 1; res = 0;
    for(i = r - 1;i >= l;i--){
      res += d * (int)(ch[i] - '0');
      d *= 10;
    }
    return res;
  }
}