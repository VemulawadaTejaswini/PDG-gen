public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, sum;
    String s;
    char a;
    char[] d;
    boolean hasa;
    d = new char[8];
    for(n = sc.nextInt();n-- > 0;){
      sum = 0; hasa = false;
      for(i = 0;i < 2;i++){
        s = sc.next(); a = s.charAt(0);
        if(a >= '2' && a <= '9')sum += (int)(a - '0');
        else if(a == 'A'){ sum += 11; hasa = true; }
        else sum += 10;
      }
      for(i = 0;i < 8;i++){ s = sc.next(); d[i] = s.charAt(0); }
      if(sum == 22)sum = 12;
      else if(sum == 21)out.println("blackjack");
      else{
        for(i = 0;i < 8;i++){
          if(sum > 17 || (sum == 17 && !hasa)){
            out.println(sum); break;
          }else{
            if(d[i] >= '2' && d[i] <= '9')sum += (int)(d[i] - '0');
            else if(d[i] == 'A'){ sum += 11; hasa = true; }
            else sum += 10;
            if(sum > 21 && hasa){
              sum -= 10; hasa = false;
            }else if(sum > 21){
              out.println("bust"); break;
            }
          }
        }
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}