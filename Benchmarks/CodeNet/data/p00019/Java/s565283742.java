import java.util.Scanner;

public class aoj0019{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    long n=s.nextInt(),a=1;
  	for(int i=1;i<=n;++i)a*=i;
    System.out.println(a);
  }
}