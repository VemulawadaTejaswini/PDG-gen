import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner  sc=new Scanner(System.in);
    int k,a,b;
    k=sc.nextInt();
    a=sc.nextInt();
    b=sc.nextInt();
    boolean flag=true	;
    for(int i=a;i<=b;i++){
      if(i%k==0){
        System.out.println("OK");
       flag=false;
        break;
      }
    }
    if(flag)
      System.out.println("NG");
  }
}
