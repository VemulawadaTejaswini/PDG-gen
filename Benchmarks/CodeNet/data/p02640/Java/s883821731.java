import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int X =sc.nextInt();
      int Y =sc.nextInt();
      
      for(int i=0; i<X; i++){
      if(i*2+(X-1)*4==Y){
      System.out.println("Yes");
      }
      }
      System.out.println("No");
    }
}