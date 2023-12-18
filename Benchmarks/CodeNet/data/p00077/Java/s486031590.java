public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[] c;
    int i, n;

    for(;sc.hasNext();){
      s = sc.next(); c = new char[s.length()];
      for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
      for(i = 0;i < s.length();i++){
        if(c[i] != '@')out.print(c[i]);
        else{
          n = (int)(c[++i] - '0');
          for(i++;n-- > 0;)out.print(c[i]);
        }
      }
      out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}