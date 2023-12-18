public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, count, r;
    char[] ch;
    String str;

    for(;;){
      str = sc.next();
      if("#".equals(str))break;
      ch = new char[str.length()];
      ch[0] = str.charAt(0);
      r = 0; count = 0;
      if((ch[0] >= 'h' && ch[0] <= 'p') || ch[0] == 'u' || ch[0] == 'y')r = 1;

      for(i = 1;i < str.length();i++){
        ch[i] = str.charAt(i);
        if((ch[i] >= 'h' && ch[i] <= 'p') || ch[i] == 'u' || ch[i] == 'y'){
          if(r == 0)count++;
          r = 1;
        }else{
          if(r == 1)count++;
          r = 0;
        }
      }
      out.println(count);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}