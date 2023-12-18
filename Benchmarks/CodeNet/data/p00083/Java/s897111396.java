public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int y, m, d;

    for(;sc.hasNext();){
      y = sc.nextInt(); m = sc.nextInt(); d = sc.nextInt();

      if(y < 1868)out.println("pre-meiji");
      else if(y == 1868 && m < 9)out.println("pre-meiji");
      else if(y == 1868 && m == 9 && d < 8)out.println("pre-meiji");
      else if(y < 1912)out.printf("meiji %d %d %d%n", y - 1867, m, d);
      else if(y == 1912 && m < 7)
        out.printf("meiji %d %d %d%n", y - 1867, m, d);
      else if(y == 1912 && m == 7 && d < 30)
        out.printf("meiji %d %d %d%n", y - 1867, m, d);
      else if(y < 1926)out.printf("taisho %d %d %d%n", y - 1911, m, d);
      else if(y == 1926 && m < 12)
        out.printf("taisho %d %d %d%n", y - 1911, m, d);
      else if(y == 1926 && m == 12 && d < 25)
        out.printf("taisho %d %d %d%n", y - 1911, m, d);
      else if(y < 1989)out.printf("showa %d %d %d%n", y - 1925, m, d);
      else if(y == 1989 && m < 1)
        out.printf("showa %d %d %d%n", y - 1925, m, d);
      else if(y == 1989 && m == 1 && d < 8)
        out.printf("showa %d %d %d%n", y - 1925, m, d);
      else out.printf("heisei %d %d %d%n", y - 1988, m, d);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}