public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String str;
    char[] ch, ch2;
    int i, j, n, m;

    str = sc.nextLine(); m = str.length();
    ch = new char[m]; ch2 = new char[m];
    for(i = 0;i < m;i++){
      ch[i] = str.charAt(i); ch2[i] = ch[i];
    }

    n = 0; i = 3;
    for(j = 0;j < m;j++){
      if(ch[j] >= 'A' && ch[j] <= 'Z'){
        ch2[j] = (char)((ch[j] - i) % ('Z' + 1));
        if(ch2[j] < 'A')ch2[j] += 'A';
      }
    }
    for(j = 0;j < m;j++)out.print(ch2[j]);
    out.println();

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}