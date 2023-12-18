import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int M1 = scanner.nextInt();
      	int D1 = scanner.nextInt();
      	int M2 = scanner.nextInt();
      	int D2 = scanner.nextInt();
      
      	if(M1 != 12) {
          	if(M2 == M1 + 1 && D2 == 1) {
              	System.out.println(1);
              	return;
            }
          	System.out.println(0);
          	return;
        }
      
      	if(M1 == 12 && M2 == 1 && D2 == 1) {
          	System.out.println(1);
          	return;
        }
     	System.out.println(0);
      	
	}
}
 

 

