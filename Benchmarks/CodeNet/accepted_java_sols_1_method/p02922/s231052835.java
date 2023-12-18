import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int anser = 0;
      	int count = 1;
      	
        while (count < B) {
            count = count + A - 1;
          	anser++;
        }
      	System.out.println(anser);
	}
}