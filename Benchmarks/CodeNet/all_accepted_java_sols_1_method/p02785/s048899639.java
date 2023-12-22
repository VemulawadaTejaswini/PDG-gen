import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     int monsters = sc.nextInt(); 
     int specialMove = sc.nextInt(); 
     int health[] = new int[monsters]; 
     
     for(int i = 0;i<monsters; i++) {
    	 health[i] = sc.nextInt(); 
     }
     
     Arrays.sort(health);
     if(specialMove > monsters) {
    	 Arrays.fill(health, 0);
     }
     else {
          for(int i = 1; i<=specialMove; i++) {
    	    health[monsters-i] = 0; 
           }
     }
    long ans = 0; 
    for(int i = 0; i<monsters; i++) {
    	ans += health[i]; 
    }
    System.out.println(ans); 
	}
}
