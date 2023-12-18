import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	
      	boolean judge = false;
      	for(int i = 1; i * A <= A * B; i++){
          if((i * A) % B == C){
            judge = true;
            break;
          }
        }
      	if(judge){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
    }
}