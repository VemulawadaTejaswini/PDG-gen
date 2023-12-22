public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int w, n;
    int[] a;
    int i, j, k, x, y, t, tmp;
    String str;
    char[] ch;

    w = sc.nextInt();
    n = sc.nextInt();
    a = new int[w];
    for(i = 0;i < w;i++)a[i] = i;

    for(i = 0;i < n;i++){
      str = sc.next();
      ch = new char[str.length()];
      x = 0; y = 0;

      for(j = 0;j < str.length();j++){
        if(str.charAt(j) == ','){
          t = 1;
          for(k = 0;k < j;k++){
            x += t * (int)(ch[j - 1 - k] - '0');
            t *= 10;
          }
          j++; break;
        }else ch[j] = str.charAt(j);
      }

      t = 1;
      for(k = str.length() - 1;k >= j;k--){
        ch[k] = str.charAt(k);
        y += (int)(ch[k] - '0') * t;
        t *= 10;
      }
      tmp = a[x - 1]; a[x - 1] = a[y - 1]; a[y - 1] = tmp;
    }

    for(i = 0;i < w;i++)out.println(a[i] + 1);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}