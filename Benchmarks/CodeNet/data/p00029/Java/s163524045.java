public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, n, max;
    String[] s;
    int[] count;
    String l;

    n = 0; s = new String[1000]; count = new int[1000];
    for(;sc.hasNext();){
      s[n] = sc.next();
      n++;
      for(i = 0;i < n - 1;i++)if(s[n - 1].equals(s[i]))count[i]++;
    }

    max = 0; l = s[0];
    for(i = 1;i < n;i++){
      if(count[max] < count[i])max = i;
      if(l.length() < s[i].length())l = s[i];
    }

    out.println(s[max] + " " + l);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}