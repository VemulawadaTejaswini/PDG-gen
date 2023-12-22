import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double tax = 1.08;
    for(int i = 1; i <= 50000; i++){
      int result = (int) (i*tax);
      if(result == n){
        System.out.println(i);
        return;
      }
    }
    System.out.println(":(");
  }
}