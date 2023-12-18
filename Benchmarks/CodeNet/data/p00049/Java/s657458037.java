public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] count;
    int i, a, l, r;
    String s;
    char[] c;

    count = new int[4];
    for(;sc.hasNextLine();){
      s = sc.nextLine();
      c = new char[s.length()];
      for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
      l = 0; r = 0;
      for(i = 0;i < s.length();i++){
        if(c[i] == ','){
          r = i;
          a = readint(c, l, r);
          l = r + 1; r = s.length();
        }
      }
      if(c[l] == 'A' && r - l == 1)count[0]++;
      else if(c[l] == 'B')count[1]++;
      else if(c[l] == 'A' && r - l == 2)count[2]++;
      else count[3]++;

    }
    for(i = 0;i < 4;i++)out.println(count[i]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int readint(char[] ch, int l, int r){
    int i, d, res;
    d = 1; res = 0;
    for(i = r - 1;i >= l;i--){
      res += d * (int)(ch[i] - '0');
      d *= 10;
    }
    return res;
  }
}