import java.util.Scanner;

class Main{
  public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int Ans=0;
    if(num<10){
      Ans+=num;
    }else{
      Ans+=9;
    }
    if(num>=100 && num<1000){
      Ans+=num-99;
    }else if(num>=1000){
      Ans+=900;
    }
    if(num>=10000 && num<100000){
      Ans+=num-9999;
    }else if(num>=100000){
      Ans+=90000;
    }
    System.out.println(Ans);
  }
}