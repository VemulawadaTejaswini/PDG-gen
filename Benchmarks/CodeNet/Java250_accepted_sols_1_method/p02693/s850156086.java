import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a<=b){
      for(int s=a;s<=b;s++){
        if(s%m==0){
          System.out.println("OK");
          break;
        }
        if((s==b)&&!(b%m==0)){
          System.out.println("NG");
        }
      }
    }
  }
}
