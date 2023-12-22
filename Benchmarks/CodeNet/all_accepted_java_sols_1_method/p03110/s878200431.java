import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    double a;
    double sum=0;
    String str;
    for(int i=0;i<n;i++){
      a=scan.nextDouble();
      str=scan.next();
      if(str.equals("BTC")) a=a*380000;
      sum=sum+a;
    }
    System.out.println(sum);
  }
}
