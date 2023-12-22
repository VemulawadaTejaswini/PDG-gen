import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	int num = sc.nextInt();
      	int[] ary = new int[num];
      	boolean hasOdd = false;	
      
      	for(int i = 0; i < num; i++) {
        	ary[i] = sc.nextInt();
          	if(ary[i] %2 == 1) hasOdd = true;
        }
      	if(hasOdd) {
        	System.out.println(0);  
        } else {
          	int min = Integer.MAX_VALUE;
        	for(int i = 0; i < num; i++) {  
          		int count = 0;
              	while(ary[i] %2 == 0) {
                	ary[i] /= 2;  
                  	count++;
                }
              	if(count < min) min = count;
            }
          	System.out.println(min);
        }
    }
}