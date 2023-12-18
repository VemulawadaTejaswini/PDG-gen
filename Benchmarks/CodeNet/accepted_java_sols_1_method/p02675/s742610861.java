import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=n%100;
    int q=p%10;
    if(q==3){
      System.out.println("bon");
    }else if((q==0)||(q==1)||(q==6)||(q==8)){
      System.out.println("pon");
    }else{
    System.out.println("hon");
    }
  }
}
