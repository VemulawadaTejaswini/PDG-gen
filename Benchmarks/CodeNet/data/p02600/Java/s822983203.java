import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //階級
    int rate = sc.nextInt();
    if(rate <= 599){
      System.out.println('8');
    }else if(rate <= 799){
      System.out.println('7');
    }else if(rate <= 999){
      System.out.println('6');
    }else if(rate <= 1199){
      System.out.println('5');
    }else if(rate <= 1399){
      System.out.println('4');
    }else if(rate <= 1599){
      System.out.println('3');
    }else if(rate <= 1799){
      System.out.println('2');
    }else if(rate <= 1999){
      System.out.println('1');
    }
  }
}