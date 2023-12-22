import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
    	
      	boolean[] array = new boolean[100+1];
  		
      	for(int i = 1;i <= 100 ;i++){
        	array[i] = false;
        }
      	
      	for(int i = 1;i <= num;i++){
        	int index = Integer.parseInt(sc.nextLine());
          	
          	array[index] = true;
        }
		
      	int ans = 0;
      	for(int i = 1;i <= 100 ;i++){
        	if(array[i] == true){
            	ans++;
            }
        }
        
      System.out.println(ans);
    	
      
    }
}