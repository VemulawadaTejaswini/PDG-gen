import java.util.Scanner;

public class Main{
	public static void main(String[] arg){
  		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
  
        if (temp < 30){
          System.out.println("No");
        }else{
          System.out.println("Yes");
        }
    }
}