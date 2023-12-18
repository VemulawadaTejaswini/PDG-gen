public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double[] resx, resy, a;
    String s;
    char[] c;
    int i, j, l;

    resx = new double[1]; resy = new double[1]; a = new double[6];

    for(;sc.hasNext();){
      s = sc.next(); c = new char[s.length()];
      for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
      l = 0; j = 0;
      for(i = 0;i < 6;j++)if(j == s.length() || c[j] == ','){
        a[i++] = readdouble(c, l, j);
        l = ++j;
      }
      getsympoint(a, resx, resy);
      out.println(resx[0] + " " + resy[0]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void getsympoint(double[] a, double[] resx, double[] resy){
    double x1, y1, x2, y2, xq, yq, t;
    x1 = a[0]; y1 = a[1]; x2 = a[2]; y2 = a[3]; xq = a[4]; yq = a[5];
    t = (x2 - x1) * (xq - x1) + (y2 - y1) * (yq - y1);
    t /= (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    resx[0] = x1 + t * (x2 - x1);
    resx[0] = resx[0] + (resx[0] - xq);
    resy[0] = y1 + t * (y2 - y1);
    resy[0] = resy[0] + (resy[0] - yq);
    return;
  }
  private static double readdouble(char[] ch, int l, int r){
    int i;
    double res, d, s = 1;
    if(ch[l] == '-'){ s = -1; l++; }
    d = 1.0; res = 0.0;
    for(i = l;i < r;i++){
      if(ch[i] == '.')break;
      d *= 10;
    }
    d /= 10;
    for(i = l;i < r;i++)if(ch[i] != '.'){
      res += d * (double)(ch[i] - '0');
      d /= 10;
    }
    return res * s;
  }
}