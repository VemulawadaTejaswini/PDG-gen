public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double a, b;
    int[] l, r;
    int i;
    l = new int[4]; r = new int[4];
    for(;sc.hasNext();){
      a = sc.nextDouble(); b = sc.nextDouble();
      if(a >= 1.1)l[0]++;
      else if(a >= 0.6)l[1]++;
      else if(a >= 0.2)l[2]++;
      else l[3]++;
      if(b >= 1.1)r[0]++;
      else if(b >= 0.6)r[1]++;
      else if(b >= 0.2)r[2]++;
      else l[3]++;
    }
    for(i = 0;i < 4;i++)out.println(l[i] + " " + r[i]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}