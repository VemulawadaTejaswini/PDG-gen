import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    if(m%1000==0){
      System.out.println("0");
    }else{
      System.out.println((m/1000+1)*1000-m);
    }
  }
}
