public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, tmp;
    for(;;){
      a = sc.nextInt();
      b = sc.nextInt();
      if(b < a){
        tmp = a;
        a = b;
        b = tmp;
      }

      if(b != 0){
        System.out.println(a + " " + b);
      }else{
        break;
      }
    }  

/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}