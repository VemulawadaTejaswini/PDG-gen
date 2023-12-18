public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, tmp;
    int[] count = new int[4];
    String s = sc.nextLine();
    for(i = 0;i < s.length();i++){
      if(s.charAt(i) == 'K')count[0]++;
      else if(s.charAt(i) == 'U')count[1]++;
      else if(s.charAt(i) == 'P')count[2]++;
      else if(s.charAt(i) == 'C')count[3]++;
    }
    for(i = 0;i < 3;i++)if(count[i] < count[i + 1]){
      tmp = count[i]; count[i] = count[i + 1]; count[i + 1] = tmp;
    }
    out.println(count[3]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}