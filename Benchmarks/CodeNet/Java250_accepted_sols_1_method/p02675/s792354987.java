import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%10==3) System.out.printf("bon");
    else if(a%10==0 || a%10==1 || a%10==6 || a%10==8) System.out.printf("pon");
    else System.out.printf("hon");
  }
}