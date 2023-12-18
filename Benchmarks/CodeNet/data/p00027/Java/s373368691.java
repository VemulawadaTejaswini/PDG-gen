public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int m, d;

    for(;;){
      m = sc.nextInt();
      if(m == 0)break;
      d = sc.nextInt();

      if(m == 1)d += 0;
      else if(m == 2) d += 31;
      else if(m == 3) d += 60;
      else if(m == 4) d += 91;
      else if(m == 5) d += 121;
      else if(m == 6) d += 152;
      else if(m == 7) d += 182;
      else if(m == 8) d += 213;
      else if(m == 9) d += 244;
      else if(m == 10) d += 274;
      else if(m == 11) d += 305;
      else if(m == 12) d += 335;

      if(d % 7 == 1)out.println("Thursday");
      else if(d % 7 == 2)out.println("Friday");
      else if(d % 7 == 3)out.println("Saturday");
      else if(d % 7 == 4)out.println("Sunday");
      else if(d % 7 == 5)out.println("Monday");
      else if(d % 7 == 6)out.println("Tuesday");
      else out.println("Wednesday");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}