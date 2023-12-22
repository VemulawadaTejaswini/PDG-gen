import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int N = stdIn.nextInt();
    int J = 0;
    for(int m=1; m<10; m++){
      if((N%m==0)&&(N/m<=9)&&(N/m>=1)){
        J = 1;
      }
    }
    if(J==1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}