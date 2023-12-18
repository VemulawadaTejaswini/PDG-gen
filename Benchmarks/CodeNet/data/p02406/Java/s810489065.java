import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner r=new Scanner(System.in);
    int t = r.nextInt();
    for (int i = 1;i <= t ;i++ ) {
      int s = i;
      if (s%3==0||s%10==3||s/10==3) {
        System.out.print(" "+i);
      }else{
        while(s!=0){
          s/=10;
          if (s%10==3) {
            System.out.print(" "+i);
            break;
          }
        }
      }
    }
    System.out.println("");
  }
}