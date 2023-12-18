public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int i, top;
    String s;
    char az;

    s = sc.next();
    az = 'A'; top = 0;
    for(i = 0;i < s.length();i++){
      if(s.charAt(i) == az){
        top++;
        if(az == 'A')az = 'Z';
        else if(az == 'Z')az = 'A';
      }
    }
    if(top < 2)out.println("-1");
    else{
      for(i = 0;i < top / 2;i++)out.print("AZ");
      out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}