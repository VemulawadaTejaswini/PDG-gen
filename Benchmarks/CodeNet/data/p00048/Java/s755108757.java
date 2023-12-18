public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double d;

    for(;sc.hasNext();){
      d = sc.nextDouble();
      if(d <= 48.0)out.println("light fly");
      else if(d <= 51.0)out.println("fly");
      else if(d <= 54.0)out.println("bantam");
      else if(d <= 57.0)out.println("feather");
      else if(d <= 60.0)out.println("light");
      else if(d <= 64.0)out.println("light welter");
      else if(d <= 69.0)out.println("welter");
      else if(d <= 75.0)out.println("light middle");
      else if(d <= 81.0)out.println("middle");
      else if(d <= 91.0)out.println("light heavy");
      else out.println("heavy");
    }


    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}