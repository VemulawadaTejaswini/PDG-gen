import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    while(scan.hasNextDouble()){
      double d = scan.nextDouble();
      d -= 48;
      int i =0;
      while(d <=48.0){
        d-=3;
        i++;
      }
      p(i);
    }
  }
    public static void p(int i){
      String l[] ={"light fly" , "fly" , "bantam" ,"feather","light","light welter","welter"
              ,"light middle","middle","light heavy","heavy"};
      
      System.out.println(l[i]);
    }
}