import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    int num=scan.nextInt();
    int ans=0;
    if(num<=a){
      ans=num;
    }else{
      if(num<=a+b){
        ans=num-b;
      }else{
        ans=a-(num-(a+b));
      }
    }
    System.out.println(ans);
  }
}