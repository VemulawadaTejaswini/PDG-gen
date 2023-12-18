import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
     	int num = scn.nextInt();
      	num = 1000 - (num % 1000);
      	if(num % 1000 == 0)
          num = 0;
      	System.out.print(num);
      	
    }
}