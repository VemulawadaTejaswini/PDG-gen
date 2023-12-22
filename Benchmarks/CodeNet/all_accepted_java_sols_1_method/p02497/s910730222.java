import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int m = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      int sum = m+f;
      if(m==-1 && f==-1 && r==-1){
        break;
      }else if(m==-1 || f==-1 || sum<30){
        System.out.printf("F\n");
      }else if(sum>=80){
        System.out.printf("A\n");
      }else if(sum>=65){
        System.out.printf("B\n");
      }else if(sum>=50){
        System.out.printf("C\n");
      }else{
        if(r>=50){
          System.out.printf("C\n");
        }else{
          System.out.printf("D\n");
        }
      }
    }
  }
}