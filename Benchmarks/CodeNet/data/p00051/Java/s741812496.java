public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, a, i, j, k, min, max, d;
    char[] ch;
    char tmp;
    String str;

    n = sc.nextInt();
    for(i = 0;i < n;i++){
      str = sc.next();
      a = str.length();
      ch = new char[a];
      for(j = 0;j < a;j++)ch[j] = str.charAt(j);
      for(j = 0;j < a - 1;j++)for(k = 0;k < a - 1 - j;k++){
        if(ch[k] > ch[k + 1]){
          tmp = ch[k]; ch[k] = ch[k + 1]; ch[k + 1] = tmp;
        }
      }

      d = 1; min = 0; max = 0;
      for(j = 0;j < a;j++){
        min += d * (int)(ch[a - 1 - j] - '0');
        max += d * (int)(ch[j] - '0');
        d *= 10;
      }
      out.println(max - min);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}