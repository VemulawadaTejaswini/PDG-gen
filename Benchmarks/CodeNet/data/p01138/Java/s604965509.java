public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, max;
    int[] t = new int[24 * 3600];
    String s;
    char[] c;

    for(;;){
      n = sc.nextInt(); if(n == 0)break;
      for(i = 0;i < 24 * 3600;i++)t[i] = 0;
      for(;n-- > 0;){
        s = sc.next();
        c = new char[s.length()];
        for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
        t[readint(c, 0, 2) * 3600 + readint(c, 3, 5) * 60 + readint(c, 6, 8)]++;
        s = sc.next();
        c = new char[s.length()];
        for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
        t[readint(c, 0, 2) * 3600 + readint(c, 3, 5) * 60 + readint(c, 6, 8)]--;
      }
      max = -1;
      for(i = 1;i < 24 * 3600;i++){
        t[i] += t[i - 1];
        if(max < t[i])max = t[i];
      }
      out.println(max);
    }

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