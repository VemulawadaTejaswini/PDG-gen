import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int happy = 0;
		if (X<500) {
			while (X>=5) {
				X -= 5;
				happy += 5;
			}			
		} else {
			while (X>=500) {
				X -= 500;
				happy += 1000;
			}
			while (X>=5) {
				X -= 5;
				happy += 5;
			}
		}

		System.out.println(happy);
      	sc.close();
    }
		
		
}