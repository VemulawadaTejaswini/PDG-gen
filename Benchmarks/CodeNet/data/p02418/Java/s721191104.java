public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    String s, p;
    char[] sch, pch;
    int i, j, n, sm, pm;

    s = sc.next();
    p = sc.next();
    sm = s.length();
    pm = p.length();
    sch = new char[sm];
    pch = new char[pm];
    for(i = 0;i < sm;i++){
      sch[i] = s.charAt(i);
    }
    for(i = 0;i < pm;i++){
      pch[i] = p.charAt(i);
    }

    n = 0;
    for(i = 0;i < sm;i++){
      n = 0;
      for(j = 0;j < pm;j++){
        if(sch[(i + j) % sm] == pch[j]){
          n++;
        }
      }
      if(n == pm)break;
    }

    if(n != pm){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}