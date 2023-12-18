public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int r, t, i, k;
    double x, y;
    char[] ch;
    String str;

    t = 90; x = 0; y = 0; k = 0;
    for(;sc.hasNext();){
      str = sc.next();
      ch = new char[str.length()];
      for(i = 0;i < str.length();i++){
        ch[i] = str.charAt(i);
        if(ch[i] == ',')k = i;
      }
      r = readint(ch, 0, k);
      x += r * Math.cos(Math.toRadians(t));
      y += r * Math.sin(Math.toRadians(t));
      t -= readint(ch, k + 1, str.length()) % 360;
    }
    out.println((int)x);
    out.println((int)y);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int readint(char[] ch, int l, int r){
    int i, d, res, sign;
    d = 1; res = 0; sign = 1;
    if(ch[l] == '-'){
      sign = -1; l++;
    }
    for(i = r - 1;i >= l;i--){
      res += d * (int)(ch[i] - '0');
      d *= 10;
    }
    return res * sign;
  }
}