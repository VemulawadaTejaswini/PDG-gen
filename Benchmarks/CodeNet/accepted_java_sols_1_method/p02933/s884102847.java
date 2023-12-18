import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int s = sc.nextInt();
      	String msg = sc.next();
		
      	if(s >= 3200){
			System.out.println(msg);
        } else {
			System.out.println("red");		
        }
      	
	}
}