import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
 int numm=scan.nextInt();
  int nummm=scan.nextInt();
  
  if(num+numm+nummm>=22){
  System.out.println("bust");
  }else{
  System.out.println("win");
  }
}
}