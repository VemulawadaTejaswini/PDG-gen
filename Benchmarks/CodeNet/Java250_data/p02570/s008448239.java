import java.util.*;

public class Main {
	public static void main( String[] args){
    	Scanner scan = new Scanner(System.in);
      	int distance = scan.nextInt();
      	int time = scan.nextInt();
      	int speed = scan.nextInt();
      	if(distance <= time * speed){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }
}