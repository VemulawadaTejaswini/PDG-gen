import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      for(int i = 1;i <= 5;i++){
          if(scan.nextInt() == 0){
              System.out.println(i);
              return;
          }
      }
    }
}