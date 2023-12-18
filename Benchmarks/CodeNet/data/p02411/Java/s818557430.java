public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int m, f, r;

    for(;;){
      m = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      if(m + f + r == -3){
        break;
      }else if(m == -1 || f == -1){
        System.out.println("F");
      }else if(m + f >= 80){
        System.out.println("A");
      }else if(m + f >= 65){
        System.out.println("B");
      }else if(m + f >= 50){
        System.out.println("C");
      }else if(m + f >= 30){
        if(r >= 50){
          System.out.println("C");
        }else{
          System.out.println("D");
        }
      }else{
        System.out.println("F");
      }
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}