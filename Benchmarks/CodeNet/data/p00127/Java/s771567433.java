public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[] c, r;
    int i;

    for(;sc.hasNext();){
      s = sc.next();
      if(s.length() % 2 == 1)out.println("NA");
      else{
        c = new char[s.length()]; r = new char[s.length() / 2];
        for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
        for(i = 0;i < s.length();i+=2){
          if(c[i] > '6' || c[i] < '1' || c[i + 1] > '5' || c[i + 1] < '1')break;
          r[i / 2] = (char)('a' + (c[i] - '1') * 5 + (c[i + 1] - '1'));
          if(r[i / 2] == (char)('a' + 26))r[i / 2] = '.';
          else if(r[i / 2] == (char)('a' + 27))r[i / 2] = '?';
          else if(r[i / 2] == (char)('a' + 28))r[i / 2] = '!';
          else if(r[i / 2] == (char)('a' + 29))r[i / 2] = ' ';
        }
        if(i < s.length())out.println("NA");
        else{
          for(i = 0;i < s.length() / 2;i++)out.print(r[i]);
          out.println();
        }
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}