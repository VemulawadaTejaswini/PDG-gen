import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int r=n%10;
    if(r==2||r==4||r==5||r==7||r==9)
      System.out.println("hon");
    else if(r==0||r==1||r==6||r==8)
      System.out.println("pon");
    else if(r==3)
      System.out.println("bon");
  }
}
