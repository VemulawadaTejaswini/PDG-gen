
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // distance
        int d = sc.nextInt();

        // time
        int t = sc.nextInt();
      	
      	//speed
      	int s=sc.nextInt();

		if(t*s>=d){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      
    }
}