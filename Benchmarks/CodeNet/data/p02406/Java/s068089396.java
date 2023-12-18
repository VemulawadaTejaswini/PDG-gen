import java.util.Scanner;
public class Main{ 
  public static void main(String[] args) {                       
    Scanner sc = new Scanner(System.in); 
    int H = sc.nextInt();
    int i;
    for(i=1;i<=H;i++){
      int S = i%3;
      int T = i%10;
      if(S==0 || T==3){
        System.out.printf(" %d",i);
      }
    }
    System.out.print("\n");
  }
}