import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      
      	int N = scanner.nextInt();
      	int L = scanner.nextInt();
      
      	String[] arrayOfWords = new String[N];

      	for(int i = 0; i < N; i++) {
          	arrayOfWords[i] = scanner.next();
          	//System.out.println(arrayOfWords[i]);
        }
      
      	Arrays.sort(arrayOfWords);
      
      	String answer = "";
         
      	for(int i = 0; i < N; i++) {
        	answer = answer + arrayOfWords[i];
        }
          
       	System.out.println(answer);  	
	}
}
 

 

