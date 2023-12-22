public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String str;
    char[] ch;
    int i, n, m;

    n = 'a' - 'A';
    str = sc.nextLine();
    m = str.length();
    ch = new char[m];
    for(i = 0;i < m;i++){
      ch[i] = str.charAt(i);
      if(ch[i] >= 'a' && ch[i] <= 'z'){
        ch[i] -= n;
      }else if(ch[i] >= 'A' && ch[i] <= 'Z'){
        ch[i] += n;
      }
    }

    for(i = 0;i < m;i++){
      System.out.print(ch[i]);
    }
    System.out.println();



    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}