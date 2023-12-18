import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int tmp = y;
        y = x;
        x = tmp;
        tmp = z;
        z = x;
        x = tmp;
        
      
		System.out.println(x + " " + y + " " + z);
	}
}