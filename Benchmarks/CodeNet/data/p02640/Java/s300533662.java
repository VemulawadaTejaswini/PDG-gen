import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int ani=scan.nextInt();
    int leg=scan.nextInt();
    if(leg<ani*2 || leg>ani*4){
      System.out.println("No");
    }else if(leg%2==0){
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
  }
}
