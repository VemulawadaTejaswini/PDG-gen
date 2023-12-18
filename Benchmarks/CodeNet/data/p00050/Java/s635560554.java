public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[] c;
    int i;

    s = sc.nextLine();
    c = new char[s.length()];
    for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
    for(i = 0;i < s.length() - 4;i++){
      if(c[i] == 'a' && c[i + 1] == 'p' && c[i + 2] == 'p'
        && c[i + 3] == 'l' && c[i + 4] == 'e'){
          c[i] = 'p'; c[i + 1] = 'e'; c[i + 2] = 'a';
          c[i + 3] = 'c'; c[i + 4] = 'h';
      }else if(c[i] == 'p' && c[i + 1] == 'e' && c[i + 2] == 'a'
        && c[i + 3] == 'c' && c[i + 4] == 'h'){
          c[i] = 'a'; c[i + 1] = 'p'; c[i + 2] = 'p';
          c[i + 3] = 'l'; c[i + 4] = 'e';
      }
    }

    for(i = 0;i < s.length();i++)out.print(c[i]);
    out.println();

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}