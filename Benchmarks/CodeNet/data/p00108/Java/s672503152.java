public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] s, c;
    int n, t, i, j;

    for(;;){
      n = sc.nextInt(); if(n == 0)break;
      s = new int[n]; c = new int[n];
      for(i = 0;i < n;i++)s[i] = sc.nextInt();
      for(t = 0;;t++){
        for(i = 0;i < n;i++)c[i] = 0;
        for(i = 0;i < n;i++)for(j = 0;j < n;j++)if(s[i] == s[j])c[i]++;
        for(i = 0;i < n;i++)if(s[i] != c[i])break;
        if(i == n)break;
        for(i = 0;i < n;i++)s[i] = c[i];
      }
      out.println(t);
      for(i = 0;i < n - 1;i++)out.print(s[i] + " ");
      out.println(s[i]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}