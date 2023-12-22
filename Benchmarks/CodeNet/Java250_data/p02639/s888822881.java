import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      
  	Integer result=15;
  	for(int i=0;i<5;i++){
      Integer num = scan.nextInt();
      result-=num;
    }
    System.out.println(result);
  }
}
