import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int m = sc.nextInt();
      	int key[] = new int[m];
      	int key_b[] = new int[m];
      	int stack;
      	int count = 0;
      	int k;
      	
      
      	for(int i = 0; i < m;i++) {
          key[i] = 0;
          key_b[i] = 0;
        }
      
      
     
      	for(int i = 0; i < n;i++){
          	k = sc.nextInt();
      		for(int j = 0; j < k;j++){
          		key_b[sc.nextInt()-1]++;           		             	
          	}
        }
      
      	for(int i = 0; i < m;i++){
        	if(key_b[i] == n) count++;
        }
      	
      
      	System.out.println(count);
      	
        
	}
}