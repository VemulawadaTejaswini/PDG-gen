import java.util.*;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int[] coins = new int[3];
	
	for(int i=0;i<3;i++){
	    coins[i] = sc.nextInt();
	}

	int x = sc.nextInt();
	
	
	int  count = 0;
	
	for(int i=0;i<=coins[0];i++){

		for(int j=0;j<=coins[1];j++){
		  
		    
			for(int k=0;k<=coins[2];k++){

			    if(((500*i)+(100*j)+(50*k)==x))count++;
			}
		}
	    
	}

	System.out.println(count);
	
	
    }
}
