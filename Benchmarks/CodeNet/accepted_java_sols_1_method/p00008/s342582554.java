import java.util.*;

public class Main {
	public static void main(String[] args) {

		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			//calculation
			int sum = 0;
		    for(int i=0;i<10;i++){
		    	for(int j=0;j<10;j++){
		    		for(int k=0;k<10;k++){
		    			for(int l=0;l<10;l++){
		    				if(i+k+j+l == n){
		    					sum++;
		    				}
		    			}
		    		}
		    	}
		    }
		    //output
		    System.out.println(sum);
		}
	}
}