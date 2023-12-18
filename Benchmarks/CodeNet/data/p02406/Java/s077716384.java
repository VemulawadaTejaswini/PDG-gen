import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=3; i<=num; i++){
      if(i%3==0||i%10==3||i-30<10)
        System.out.printf(" %d", i);
    }
    System.out.printf("\n");
  }
}

