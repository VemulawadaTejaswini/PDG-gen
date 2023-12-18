import java.util.scanner;
public class Calc{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    double i=Double.parseDouble(a);
    double sum=0;
    for(double j=1;j<=3;j++){
      sum=Math.pow(a,j);
    }
  }
}