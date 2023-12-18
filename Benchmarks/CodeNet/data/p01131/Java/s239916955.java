public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, count;
    String s;
    char[] c;

    n = sc.nextInt();
    for(;n-- > 0;){
      s = sc.next();
      c = new char[s.length()];
      for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
      for(i = 0;i < s.length();i = ++j){
        count = 0;
        for(j = i;j < s.length();j++){
          if(c[j] == '0'){
            if(count == 0)break;
            if(c[j - 1] == '1'){
              if(count % 5 == 1)out.print(".");
              else if(count % 5 == 2)out.print(",");
              else if(count % 5 == 3)out.print("!");
              else if(count % 5 == 4)out.print("?");
              else out.print(" ");
              break;
            }else if(c[j - 1] == '2'){
              out.print((char)('a' + (2 + count) % 3)); break;
            }else if(c[j - 1] == '3'){
              out.print((char)('d' + (2 + count) % 3)); break;
            }else if(c[j - 1] == '4'){
              out.print((char)('g' + (2 + count) % 3)); break;
            }else if(c[j - 1] == '5'){
              out.print((char)('j' + (2 + count) % 3)); break;
            }else if(c[j - 1] == '6'){
              out.print((char)('m' + (2 + count) % 3)); break;
            }else if(c[j - 1] == '7'){
              out.print((char)('p' + (3 + count) % 4)); break;
            }else if(c[j - 1] == '8'){
              out.print((char)('t' + (2 + count) % 3)); break;
            }else if(c[j - 1] == '9'){
              out.print((char)('w' + (3 + count) % 4)); break;
            }
          }else count++;
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