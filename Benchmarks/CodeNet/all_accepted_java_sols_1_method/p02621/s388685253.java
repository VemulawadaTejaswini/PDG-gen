import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    double i=Double.parseDouble(a);
    int sum=0;
    for(double j=1;j<=3;j++){
      sum+=(int) Math.pow(i,j);
    }
    System.out.println(sum);
  }
}