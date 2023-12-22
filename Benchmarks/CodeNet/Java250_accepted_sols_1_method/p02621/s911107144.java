import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int result = 0;
    for(int i = 1;i < 4;i++){
    	result += Math.pow(a,i);
  	}
    System.out.println(result);
  }
}