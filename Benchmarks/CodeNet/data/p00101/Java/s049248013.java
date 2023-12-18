public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[] c;
    int i, n;

    n = sc.nextInt(); s = sc.nextLine();
    for(;n-- > 0;){
      s = sc.nextLine(); c = new char[s.length()];
      for(i = 0;i < s.length();i++)c[i] = s.charAt(i);

      for(i = 0;i < s.length() - 6;i++){
        if(c[i] == 'H' && c[i + 1] == 'o' && c[i + 2] == 's' && c[i + 3] == 'h'
         && c[i + 4] == 'i' && c[i + 5] == 'n' && c[i + 6] == 'o')
         c[i + 6] = 'a';
        out.print(c[i]);
      }
      for(;i < s.length();i++)out.print(c[i]);
      out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}