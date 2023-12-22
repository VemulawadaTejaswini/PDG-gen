public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String str;
    char[] ch;
    int i, n, m;

    for(;;){
      str = sc.nextLine();
      m = str.length();
      ch = new char[m];
      n = 0;
      for(i = 0;i < m;i++){
        ch[i] = str.charAt(i);
        n += (int)(ch[i] - '0');
      }

      if(n == 0)break;
      System.out.println(n);
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}