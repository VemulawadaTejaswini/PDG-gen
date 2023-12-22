import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ab[] =new int[num2 * 2];
		for(int i = 0; i < num2 * 2; i++){
			ab[i] = sc.nextInt();
        }
        int count[] = new int[num1];
        for(int n = 0; n < num1; n++){
        	 for(int i = 0; i < num2 * 2; i++){
             	if(n + 1 == ab[i]){
                	count[n]++;
                }
             }
        }
        for(int i = 0; i < num1; i++){
        	System.out.println(count[i]);
        }
	}
}