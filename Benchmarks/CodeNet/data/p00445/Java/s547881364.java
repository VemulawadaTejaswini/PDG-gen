public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    String s;
    char[] c;
    int i, joi, ioi;

    for(;sc.hasNextLine();){
      s = sc.nextLine();
      c = new char[s.length()];
      for(i = 0;i < s.length();i++)c[i] = s.charAt(i);
      joi = 0; ioi = 0;
      for(i = 0;i < s.length() - 2;i++){
        if(c[i] == 'J' && c[i + 1] == 'O' && c[i + 2] == 'I'){joi++; i++;}
        else if(c[i] == 'I' && c[i + 1] == 'O' && c[i + 2] == 'I'){ioi++; i++;}
      }
      out.println(joi);
      out.println(ioi);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}